import java.util.Scanner;

public class HitungGaji {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double gajiPokok, tunjanganKinerja, tunjanganLain, totalGaji;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        tunjanganKinerja = 0.2 * gajiPokok;
        tunjanganLain = 0.1 * tunjanganKinerja;
        totalGaji = gajiPokok + tunjanganKinerja + tunjanganLain;

        System.out.println("\n=== Rincian Gaji ===");
        System.out.println("Gaji Pokok        : " + gajiPokok);
        System.out.println("Tunjangan Kinerja : " + tunjanganKinerja);
        System.out.println("Tunjangan Lain    : " + tunjanganLain);
        System.out.println("Total Gaji        : " + totalGaji);
    }
}
























// 📘 Penjelasan

// Tunjangan kinerja = 20% dari gaji pokok → 0.2 * gajiPokok

// Tunjangan lain = 10% dari tunjangan kinerja → 0.1 * tunjanganKinerja

// Total gaji = gaji pokok + tunjangan kinerja + tunjangan lain
// Sehingga hasil akhir menunjukkan total pendapatan.

