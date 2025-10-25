import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        final double PHI = 3.14;
        double r, luas;

        System.out.print("Masukkan jari-jari lingkaran = ");
        r = input.nextDouble();

        luas = PHI * r * r;

        System.out.println("Luas lingkaran = " + luas);
    }
}


// Pseudocode
// Deklarasi:
//     r : float
//     luas : float
//     phi = 3.14

// Deskripsi:
//     Tulis "Masukkan jari-jari lingkaran = "
//     Input r
//     luas = phi * r * r
//     Tulis "Luas lingkaran = ", luas

// 📘 Penjelasan

// Rumus luas lingkaran:

// L = π × r²


// Nilai π (phi) didefinisikan sebagai 3.14,

// Program menghitung hasilnya berdasarkan jari-jari (r) yang dimasukkan user.