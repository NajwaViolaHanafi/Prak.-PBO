import java.util.Scanner;

public class LuasPersegiPanjang {
    static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        double luas = hitungLuas(panjang, lebar);

        System.out.println("Luas persegi panjang = " + luas);
    }
}