public class MahasiswaDemo {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "123456";
        m2.nama = "Viola Hanafi";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2D";

        System.out.println("=== DATA MAHASISWA 1 ===");
        m1.displayBiodata();
        System.out.println();
        System.out.println("=== DATA MAHASISWA 2 ===");
        m2.displayBiodata();
    }
}