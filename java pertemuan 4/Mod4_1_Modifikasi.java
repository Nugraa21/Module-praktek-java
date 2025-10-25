import java.util.Scanner;

public class Mod4_1_Modifikasi {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);

        int B, C, D, A;

        System.out.print("Masukkan nilai B = ");
        B = masuk.nextInt();

        System.out.print("Masukkan nilai C = ");
        C = masuk.nextInt();

        System.out.print("Masukkan nilai D = ");
        D = masuk.nextInt();

        A = B + C * D;

        System.out.println("Hasil A = " + A);
    }
}

// Output menampilkan nilai hasil perhitungan sesuai dengan aturan prioritas operator dalam Java, yaitu perkalian (*) dilakukan lebih dulu daripada penjumlahan (+).

// Langkah perhitungan:

// A = B + C * D
// A = 5 + 3 * 6
// A = 5 + 18
// A = 23


// Maka hasil akhir A = 23.