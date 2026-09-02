import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil = 0; // Mendeklarasikan variabel yang digunakan dalam kalkulator
        char operator;

        // Memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        // Memasukkan operator perhitungan
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        // Memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        // Memilih operasi perhitungan berdasarkan operator
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;

            case '-':
                hasil = angka1 - angka2;
                break;

            case '*':
                hasil = angka1 * angka2;
                break;

            case '/':
                // Memastikan angka kedua tidak bernilai 0
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak bisa dibagi dengan 0!");
                    input.close();
                    return;
                }
                break;

            default:
                System.out.println("Operator tidak valid!");
                input.close();
                return;
        }
        System.out.println("Hasil = " + hasil);

        input.close();
    }
}