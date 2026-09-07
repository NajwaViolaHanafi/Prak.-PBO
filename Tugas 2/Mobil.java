public class Mobil {
    String merk;
    String nomorPlat;
    int tahun;
    int jumlahPintu;

    // Constructor berparameter
    public Mobil(String merk, String nomorPlat, int tahun, int jumlahPintu) {
        this.merk = merk;
        this.nomorPlat = nomorPlat;
        this.tahun = tahun;
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Nomor Plat   : " + nomorPlat);
        System.out.println("Tahun        : " + tahun);
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}