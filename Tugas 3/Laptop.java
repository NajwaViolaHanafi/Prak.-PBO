public class Laptop {
    public String merk;
    public String warna;
    public String processor;
    public int ram;

    // Constructor tanpa parameter
    public Laptop() {
        merk = "ASUS";
        warna = "Hitam";
        processor = "Intel Core i5";
        ram = 8;
    }

    // Constructor berparameter
    public Laptop(String merk, String warna, String processor, int ram) {
        this.merk = merk;
        this.warna = warna;
        this.processor = processor;
        this.ram = ram;
    }

    public void nyalakan() {
        System.out.println("Laptop dinyalakan");
    }

    public void matikan() {
        System.out.println("Laptop dimatikan");
    }

    public void restart() {
        System.out.println("Laptop direstart");
    }
}