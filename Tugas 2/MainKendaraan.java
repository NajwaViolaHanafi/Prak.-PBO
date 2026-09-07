public class MainKendaraan {
    public static void main(String[] args) {

        // Membuat object Kendaraan
        Kendaraan kendaraan1 = new Kendaraan(
            "Toyota",
            "N 1111 AA",
            2022
        );

        // Membuat object Mobil
        Mobil mobil1 = new Mobil(
            "Toyota",
            "N 2222 BB",
            2023,
            4
        );

        // Membuat object Motor
        Motor motor1 = new Motor();

        System.out.println("=== DATA KENDARAAN ===");
        kendaraan1.tampilInfo();

        System.out.println();

        System.out.println("=== DATA MOBIL ===");
        mobil1.tampilInfo();

        System.out.println();

        System.out.println("=== DATA MOTOR ===");
        motor1.tampilInfo();
    }
}