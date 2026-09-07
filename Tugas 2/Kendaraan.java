public class Kendaraan {
    String merk;
    String nomorPlat;
    int tahun;

    // Constructor berparameter
    public Kendaraan(String merk, String nomorPlat, int tahun) {
        this.merk = merk;
        this.nomorPlat = nomorPlat;
        this.tahun = tahun;
    }

    public void tampilInfo() {
        System.out.println("Merk        : " + merk);
        System.out.println("Nomor Plat  : " + nomorPlat);
        System.out.println("Tahun       : " + tahun);
    }
}