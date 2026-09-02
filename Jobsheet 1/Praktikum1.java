public class Praktikum1 {
    public static void main(String[] args) {
        String merek1, merek2, merek3, merek4, merek5, merek6, merek7, merek8, merek9, merek10;
        String jenis1, jenis2, jenis3, jenis4, jenis5, jenis6, jenis7, jenis8, jenis9, jenis10;
        double harga1, harga2, harga3, harga4, harga5, harga6, harga7, harga8, harga9, harga10;
        double totalHarga1, totalHarga2, totalHarga3, totalHarga4, totalHarga5, totalHarga6, totalHarga7, totalHarga8, totalHarga9, totalHarga10;

        int jumlahBeli = 3; // Jumlah kosmetik yang dibeli

        merek1 = "Wardah";
        jenis1 = "Lipstick";
        harga1 = 50000;

        merek2 = "Emina";
        jenis2 = "Lip Tint";
        harga2 = 45000;

        merek3 = "Somethinc";
        jenis3 = "Foundation";
        harga3 = 150000;

        merek4 = "Make Over";
        jenis4 = "Powder";
        harga4 = 120000;

        merek5 = "Maybelline";
        jenis5 = "Mascara";
        harga5 = 130000;

        merek6 = "Skintific";
        jenis6 = "Cushion";
        harga6 = 140000;

        merek7 = "Implora";
        jenis7 = "Lip Cream";
        harga7 = 30000;

        merek8 = "Hanasui";
        jenis8 = "Serum";
        harga8 = 60000;

        merek9 = "Madame Gie";
        jenis9 = "Blush On";
        harga9 = 40000;

        merek10 = "Luxcrime";
        jenis10 = "Setting Spray";
        harga10 = 100000;

        System.out.println("=== DATA 10 KOSMETIK ===\n");

        totalHarga1 = hitungTotalHarga(harga1, jumlahBeli);
        totalHarga2 = hitungTotalHarga(harga2, jumlahBeli);
        totalHarga3 = hitungTotalHarga(harga3, jumlahBeli);
        totalHarga4 = hitungTotalHarga(harga4, jumlahBeli);
        totalHarga5 = hitungTotalHarga(harga5, jumlahBeli);
        totalHarga6 = hitungTotalHarga(harga6, jumlahBeli);
        totalHarga7 = hitungTotalHarga(harga7, jumlahBeli);
        totalHarga8 = hitungTotalHarga(harga8, jumlahBeli);
        totalHarga9 = hitungTotalHarga(harga9, jumlahBeli);
        totalHarga10 = hitungTotalHarga(harga10, jumlahBeli);

           // Menampilkan informasi semua kosmetik
        tampilInfo(merek1, jenis1, harga1, totalHarga1);
        tampilInfo(merek2, jenis2, harga2, totalHarga2);
        tampilInfo(merek3, jenis3, harga3, totalHarga3);
        tampilInfo(merek4, jenis4, harga4, totalHarga4);
        tampilInfo(merek5, jenis5, harga5, totalHarga5);
        tampilInfo(merek6, jenis6, harga6, totalHarga6);
        tampilInfo(merek7, jenis7, harga7, totalHarga7);
        tampilInfo(merek8, jenis8, harga8, totalHarga8);
        tampilInfo(merek9, jenis9, harga9, totalHarga9);
        tampilInfo(merek10, jenis10, harga10, totalHarga10);
    }

    // Function untuk menampilkan informasi kosmetik
    public static void tampilInfo(String merek, String jenis, double harga, double totalHarga) {
        System.out.println("Merek : " + merek);
        System.out.println("Jenis : " + jenis);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Total Harga : Rp" + totalHarga);
        System.out.println();
    }

    // Function untuk menghitung total harga kosmetik
    public static double hitungTotalHarga(double harga, int jumlah) {
        double totalHarga = harga * jumlah;
        return totalHarga;
    }
}