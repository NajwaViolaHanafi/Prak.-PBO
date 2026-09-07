import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil = 0; // Mendeklarasikan variabel yang digunakan dalam kalkulator,
        //untuk menyimpan angka pertama, angka kedua, dan hasil perhitungan yang bisa berupa bilangan desimal.
        char operator; //Deklarasi variabel bertipe char untuk menyimpan satu karakter operator seperti +, -, *, atau /

        // Memasukkan angka pertama
        System.out.print("Masukkan angka pertama: "); 
        //Method print() digunakan untuk menampilkan instruksi kepada pengguna agar memasukkan angka pertama.
        angka1 = input.nextDouble();
        //Method nextDouble() digunakan untuk membaca input angka desimal dari pengguna dan menyimpannya ke angka1.

        // Memasukkan operator perhitungan
        System.out.print("Masukkan operator (+, -, *, /): ");
        //Method print() digunakan untuk meminta pengguna memasukkan operator perhitungan.
        operator = input.next().charAt(0);
        //Method next() dan charAt(0) digunakan untuk membaca input operator 
        //sebagai teks lalu mengambil karakter pertamanya dan menyimpannya ke operator.

        // Memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        //Method print() digunakan untuk meminta pengguna memasukkan angka kedua.
        angka2 = input.nextDouble();
        //Method nextDouble() digunakan untuk membaca angka kedua dari keyboard dan menyimpannya ke angka2.

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
                    // Jika angka kedua tidak 0, lakukan pembagian
                    hasil = angka1 / angka2;
                } else {
                    // Jika angka kedua 0, tampilkan pesan kesalahan dan hentikan program
                    System.out.println("Tidak bisa dibagi dengan 0!");
                    input.close();
                    return;
                }
                break;

            default:
                // Jika operator tidak valid, tampilkan pesan kesalahan dan hentikan program
                System.out.println("Operator tidak valid!");
                input.close();
                return;
        }
        System.out.println("Hasil = " + hasil);

        input.close();
    }
}