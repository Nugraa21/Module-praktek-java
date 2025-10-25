import java.util.Scanner;

public class Mod4_3 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int Bil1, Bil2, Hasil;

        System.out.print("Masukkan Bil 1 = ");
        Bil1 = masuk.nextInt();

        System.out.print("Masukkan Bil 2 = ");
        Bil2 = masuk.nextInt();

        Hasil = Bil1 % Bil2;

        System.out.println("Hasil = " + Hasil);
    }
}


// Program ini meminta dua bilangan dari pengguna, yaitu Bil1 dan Bil2.
// Operasi Hasil = Bil1 % Bil2; menggunakan operator modulus (%), yaitu operator yang menghasilkan sisa hasil pembagian antara dua bilangan.

// Contoh:
// Jika Bil1 = 10 dan Bil2 = 3, maka

// Hasil = 10 % 3 = 1


// karena 10 dibagi 3 menghasilkan 3 sisa 1.

// Jadi output program menampilkan:

// Hasil = 1