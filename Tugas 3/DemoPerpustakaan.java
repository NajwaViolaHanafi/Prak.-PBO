public class DemoPerpustakaan {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        buku1.judul = "Dasar Pemrograman Java";
        buku1.penulis = "Budi Santoso";
        buku1.tahunTerbit = 2025;
        buku1.kategori = "Pemrograman";

        Anggota anggota1 = new Anggota();
        anggota1.nama = "Najwa Viola Hanafi";
        anggota1.nim = "254107060002";
        anggota1.jurusan = "Teknologi Informasi";

        System.out.println("=== DATA BUKU ===");
        buku1.tampilkanInfo();

        System.out.println();

        System.out.println("=== DATA ANGGOTA ===");
        anggota1.tampilkanInfo();

        System.out.println();

        System.out.println("=== AKTIVITAS PERPUSTAKAAN ===");
        buku1.pinjamBuku();
        anggota1.pinjamBuku();

        System.out.println();

        buku1.kembalikanBuku();
        anggota1.kembalikanBuku();
    }
}