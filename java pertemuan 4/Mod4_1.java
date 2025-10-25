public class Mod4_1
{
    public static void main(String args[]){
        int B,C,D,A;
        B=5;
        C=3;
        D=6;
        A = B+C*D;
        System.out.println("Hasil A = "+A);
    }
}

// Output program adalah:

// Hasil A = 23


// Alasannya:

// Nilai variabel:

// B = 5

// C = 3

// D = 6

// Operasi pada baris A = B + C * D; mengikuti aturan prioritas operator (operator precedence) dalam Java, di mana perkalian (*) dikerjakan lebih dulu daripada penjumlahan (+).

// Jadi:

// A = B + (C * D)
// A = 5 + (3 * 6)
// A = 5 + 18
// A = 23


// Maka hasil yang ditampilkan oleh program adalah:

// Hasil A = 23