public class Peserta {
    private final String idPeserta;
    private String namaPeserta;
    private double praktik, teori, proyek;

    public Peserta(String idPeserta, String namaPeserta, double praktik, double teori, double proyek) {
        this.idPeserta = idPeserta;
        this.namaPeserta = namaPeserta;

        setPraktik(praktik);
        setTeori(teori);
        setProyek(proyek);
    }
    public String getIdPeserta() {
        return idPeserta;
    }
    public String getNamaPeserta() {
        return namaPeserta;
    }
    public double getPraktik() {
        return praktik;
    }
    public double getTeori() {
        return teori;
    }
    public double getProyek() {
        return proyek;
    }
    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }
    public void setPraktik(double praktik) {
        if (praktik >= 0 && praktik <= 100) {
            this.praktik = praktik;
        } else {
            System.out.println("Nilai praktik harus antara 0-100.");
        }
    }
    public void setTeori(double teori) {
        if (teori >= 0 && teori <= 100) {
            this.teori = teori;
        } else {
            System.out.println("Nilai teori harus antara 0-100.");
        }
    }
    public void setProyek(double proyek) {
        if (proyek >= 0 && proyek <= 100) {
            this.proyek = proyek;
        } else {
            System.out.println("Nilai proyek harus antara 0-100.");
        }
    }
    public double hitungNilaiAkhir() {
        return (praktik * 0.40) + (teori * 0.30) + (proyek * 0.30);
    }
    public boolean cekLulus() {
        double nilaiAkhir = hitungNilaiAkhir();
        return nilaiAkhir >= 70 && praktik >= 60 && teori >= 60 && proyek >= 60;
    }
    public void tampilkanInfo() {
        System.out.println("ID Peserta: " + idPeserta);
        System.out.println("Nama Peserta: " + namaPeserta);
        System.out.println("Nilai Praktik: " + praktik);
        System.out.println("Nilai Teori: " + teori);
        System.out.println("Nilai Proyek: " + proyek);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Status: " + (cekLulus() ? "Lulus" : "Tidak Lulus"));
    }
}
