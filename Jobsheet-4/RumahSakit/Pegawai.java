public class Pegawai {
    // Atribut
    private String nip;
    private String nama;

    // Constructor
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method Menampilkan Informasi Pegawai
    public String getInfo() {
        return nama + " (" + nip + ")";
    }
}