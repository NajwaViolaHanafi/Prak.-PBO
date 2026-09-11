public class DemoLaptop {
    public static void main(String[] args) {

        // Menggunakan constructor tanpa parameter
        Laptop laptop1 = new Laptop();

        // Menggunakan constructor berparameter
        Laptop laptop2 = new Laptop(
            "Lenovo",
            "Abu-abu",
            "Intel Core i7",
            16
        );

        System.out.println("Laptop 1");
        System.out.println("Merk: " + laptop1.merk);
        System.out.println("Warna: " + laptop1.warna);
        System.out.println("Processor: " + laptop1.processor);
        System.out.println("RAM: " + laptop1.ram + " GB");

        laptop1.nyalakan();

        System.out.println();

        System.out.println("Laptop 2");
        System.out.println("Merk: " + laptop2.merk);
        System.out.println("Warna: " + laptop2.warna);
        System.out.println("Processor: " + laptop2.processor);
        System.out.println("RAM: " + laptop2.ram + " GB");

        laptop2.nyalakan();
    }
}