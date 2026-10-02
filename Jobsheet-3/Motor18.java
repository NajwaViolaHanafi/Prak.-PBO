public class Motor18 {
    String platNomor;
    int kecepatan;
    boolean isMesinOn;

    public void displayStatus() {
        System.out.println("Plat nomor: " + platNomor);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Mesin menyala: " + isMesinOn);

        if (isMesinOn) {
            System.out.println("Mesin: ON");
        } else {
            System.out.println("Mesin: OFF");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("================================");
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal adalah 100!");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif!");
        } else {
            this.kecepatan = kecepatan;
        }
    }
}