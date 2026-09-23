public class DemoRuangLab {
    public static void main(String[] args) {
        RuangLab ruang1 = new RuangLab("R001", "Laboratorium Komputer 1", 30);
        RuangLab ruang2 = new RuangLab("R002", "Laboratorium Komputer 2", 25);
        RuangLab ruang3 = new RuangLab("R003", "Laboratorium Komputer 3", 20);
        System.out.println("----DATA AWAL RUANG----");

        ruang1.tampilkanInfo();
        System.out.println();
        ruang2.tampilkanInfo();
        System.out.println();
        ruang3.tampilkanInfo();
        System.out.println();

        System.out.println("Pengujian");

        ruang1.pesan(20);
        ruang1.pesan(10);

        ruang1.batal();
        ruang1.batal();

        ruang2.pesan(0);
        ruang2.pesan(30);
        ruang3.pesan(15);

        System.out.println();
        System.out.println("----DATA AKHIR RUANG----");

        ruang1.tampilkanInfo();
        System.out.println();

        ruang2.tampilkanInfo();
        System.out.println();

        ruang3.tampilkanInfo();
    }
}
