public class Mahasiswa18 {
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public Mahasiswa18(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        setIpk(ipk);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getIpk() {
        return ipk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.00 && ipk <= 4.00) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK harus 0.00 - 4.00");
        }
    }
}