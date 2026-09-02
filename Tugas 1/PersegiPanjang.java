import java.util.Scanner;

class PersegiPanjang {
    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    double hitungLuas() {
        return panjang * lebar;
    }
}

class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);

        System.out.println("Luas persegi panjang = " + pp.hitungLuas());
    }
}