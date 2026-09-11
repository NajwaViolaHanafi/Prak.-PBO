public class Anggota {
    public String nama;
    public String nim;
    public String jurusan;

    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }

    public void pinjamBuku() {
        System.out.println(nama + " meminjam buku");
    }

    public void kembalikanBuku() {
        System.out.println(nama + " mengembalikan buku");
    }
}