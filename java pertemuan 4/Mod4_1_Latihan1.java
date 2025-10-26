import java.util.Scanner;

public class Mod4_1_Latihan1 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int B, C, D, A;

        System.out.print("Masukkan nilai B = ");
        B = masuk.nextInt();

        System.out.print("Masukkan nilai D = ");
        D = masuk.nextInt();

        C = B * 2; // C diperoleh dari B dikali 2
        A = B + C * D;

        System.out.println("Nilai C = " + C);
        System.out.println("Hasil A = " + A);
    }
}






























// Penjelasan

// Nilai C tidak dimasukkan oleh user, tetapi dihitung dari B * 2.

// Rumus utama tetap: A = B + C * D.

// Output menunjukkan hasil C dan A.

// 📊 Contoh Output
// Masukkan nilai B = 5
// Masukkan nilai D = 6
// Nilai C = 10
// Hasil A = 65


// Penjelasan:

// C = 5 * 2 = 10
// A = 5 + 10 * 6 = 5 + 60 = 65