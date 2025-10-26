import java.util.Scanner;

public class Biodata {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir (dd-mm-yyyy): ");
        String tanggalLahir = input.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        input.nextLine(); // membersihkan buffer

        System.out.print("Masukkan No HP: ");
        String noHp = input.nextLine();

        System.out.print("Masukkan Email: ");
        String email = input.nextLine();
le
        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Usia           : " + usia);
        System.out.println("No HP          : " + noHp);
        System.out.println("E-mail         : " + email);
        System.out.println("Jurusan        : " + jurusan);
        System.out.println("Alamat         : " + alamat);
    }
}




// 📘 Penjelasan

// Program meminta pengguna memasukkan seluruh data biodata melalui Scanner, lalu menampilkannya kembali secara rapi.

// 📊 Contoh Output
// Masukkan NIM: 2301010123
// Masukkan Nama: Ludang Prasetyo Nugroho
// Masukkan Tempat Lahir: Bantul
// Masukkan Tanggal Lahir (dd-mm-yyyy): 15-02-2003
// Masukkan Usia: 22
// Masukkan No HP: 081234567890
// Masukkan Email: ludang@example.com
// Masukkan Jurusan: Teknik Komputer
// Masukkan Alamat: Sleman

// === BIODATA MAHASISWA ===
// NIM            : 2301010123
// Nama           : Ludang Prasetyo Nugroho
// Tempat Lahir   : Bantul
// Tanggal Lahir  : 15-02-2003
// Usia           : 22
// No HP          : 081234567890
// E-mail         : ludang@example.com
// Jurusan        : Teknik Komputer
// Alamat         : Sleman