public class RuangLab{
    private final String idRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean tersedia;

    public RuangLab(String idRuang, String namaRuang, int kapasitas){
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.tersedia = true;
    }
    public String getIdRuang() {
        return idRuang;
    }
    public String getNamaRuang() {
        return namaRuang;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }
    public void setKapasitas(int kapasitas) {
        if (kapasitas > 0) {
            this.kapasitas = kapasitas;
        } else {
            System.out.println("Kapasitas harus lebih dari 0.");
        }
    }
    public void pesan(int jumlahPeserta) {
        if (jumlahPeserta <= 0) {
            System.out.println("Pemesanan ditolak: Jumlah peserta harus lebih dari 0.");
        } else if (jumlahPeserta > kapasitas) {
            System.out.println("Pemesanan ditolak: Jumlah peserta melebihi kapasitas ruang.");
        } else if (!tersedia) {
            System.out.println("Pemesanan ditolak: Ruang sudah dipesan.");
        } else {
            tersedia = false;
            System.out.println("Pemesanan berhasil untuk " + namaRuang);
        }
    }
    public void batal() {
        if (tersedia) {
            System.out.println("Pembatalan ditolak: Ruang masih tersedia.");
        } else {
            tersedia = true;
            System.out.println("Pembatalan berhasil untuk " + namaRuang);
        }
    }
    public void tampilkanInfo() {
        System.out.println("ID Ruang: " + idRuang);
        System.out.println("Nama Ruang: " + namaRuang);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
    }
}