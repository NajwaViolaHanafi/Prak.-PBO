public class Motor {
    String merk;
    String nomorPlat;
    int tahun;

    // Constructor tanpa parameter
    public Motor() {
        merk = "Honda";
        nomorPlat = "N 3333 CC";
        tahun = 2024;
    }

    public void tampilInfo() {
        System.out.println("Merk        : " + merk);
        System.out.println("Nomor Plat  : " + nomorPlat);
        System.out.println("Tahun       : " + tahun);
    }
}