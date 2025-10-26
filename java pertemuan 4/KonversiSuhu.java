import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double c, r, f;

        System.out.print("Masukkan suhu dalam Celcius = ");
        c = input.nextDouble();

        r = (4.0 / 5.0) * c;
        f = (9.0 / 5.0) * c + 32;

        System.out.println("Hasil dalam Reamur = " + r);
        System.out.println("Hasil dalam Fahrenheit = " + f);
    }
}
































// Pseudocode
// Deklarasi:
//     C, R, F : float

// Deskripsi:
//     Tulis "Masukkan suhu dalam Celcius = "
//     Input C
//     R = (4.0 / 5.0) * C
//     F = (9.0 / 5.0) * C + 32
//     Tulis "Hasil dalam Reamur = ", R
//     Tulis "Hasil dalam Fahrenheit = ", F
// 📘 Penjelasan

// Rumus konversi:

// Reamur (R) = (4/5) × Celcius

// Fahrenheit (F) = (9/5) × Celcius + 32

// Nilai diubah sesuai dengan rumus fisika konversi suhu.

// 🧾 Kesimpulan Umum
// Nomor	Program	Konsep Utama	Rumus / Prinsip
// 1	Hitung Gaji	Operasi aritmatika & persentase	Gaji total = Gaji Pokok + 20% Gaji Pokok + 10% Tunjangan Kinerja
// 2	Konversi Suhu	Perhitungan suhu dari Celcius ke skala lain	R = 4/5 × C, F = 9/5 × C + 32