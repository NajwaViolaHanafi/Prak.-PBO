public class DemoPeserta {
    public static void main(String[] args) {
        System.out.println("----DATA PESERTA----");

        Peserta peserta1 = new Peserta("POO1", "Viola", 80, 75, 85);
        Peserta peserta2 = new Peserta("P002", "Ica", 50, 55, 60);
        Peserta peserta3 = new Peserta("P003", "Lingga", 50, 90, 90);

        peserta1.tampilkanInfo();
        System.out.println();
        peserta2.tampilkanInfo();
        System.out.println();
        peserta3.tampilkanInfo();


        System.out.println();
        System.out.println("Pengujian Nilai Tidak Valid");
        peserta1.setPraktik(110);
        peserta2.setTeori(-10);
    }
}
