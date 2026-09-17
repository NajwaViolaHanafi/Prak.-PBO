public class MahasiswaDemo18 {
    private static class Mahasiswa18 {
        private String nim;
        private String nama;
        private String alamat;
        private double ipk;

        Mahasiswa18(String nim, String nama, String alamat, double ipk) {
            this.nim = nim;
            this.nama = nama;
            this.alamat = alamat;
            setIpk(ipk);
        }

        String getNim() { return nim; }
        String getNama() { return nama; }
        String getAlamat() { return alamat; }
        double getIpk() { return ipk; }

        void setNama(String nama) { this.nama = nama; }
        void setAlamat(String alamat) { this.alamat = alamat; }
        void setIpk(double ipk) {
            if (ipk >= 0.0 && ipk <= 4.0) {
                this.ipk = ipk;
            } else {
                System.out.println("IPK harus berada di antara 0.00 dan 4.00");
            }
        }
    }

    public static void main(String[] args) {

        Mahasiswa18 mhs1 = new Mahasiswa18("2441001", "Najwa", "Malang", 3.75);
        Mahasiswa18 mhs2 = new Mahasiswa18("2441002", "Viola", "Kediri", 3.50);

        System.out.println("=== DATA MAHASISWA ===");

        System.out.println("Mahasiswa 1");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.println("IPK    : " + mhs1.getIpk());

        System.out.println();

        System.out.println("Mahasiswa 2");
        System.out.println("NIM    : " + mhs2.getNim());
        System.out.println("Nama   : " + mhs2.getNama());
        System.out.println("Alamat : " + mhs2.getAlamat());
        System.out.println("IPK    : " + mhs2.getIpk());

        mhs1.setNama("Najwa Viola");
        mhs1.setAlamat("Malang");
        mhs1.setIpk(3.90);

        System.out.println();
        System.out.println("=== DATA SETELAH DIUBAH ===");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.println("IPK    : " + mhs1.getIpk());

        System.out.println();
        System.out.println("=== UJI VALIDASI IPK ===");
        mhs1.setIpk(4.50);

    }
}