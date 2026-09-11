public class Buku {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public String kategori;

    public void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Kategori    : " + kategori);
    }

    public void pinjamBuku() {
        System.out.println("Buku " + judul + " berhasil dipinjam");
    }

    public void kembalikanBuku() {
        System.out.println("Buku " + judul + " berhasil dikembalikan");
    }
}