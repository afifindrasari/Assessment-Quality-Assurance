package BLQ;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        //Jam 3:00 → 90
        //Jam 5:30 → 15
        //Jam 2:20 → 50

        // Meminta pengguna memasukkan nilai jam
        System.out.print("Masukkan jam (format 24 jam): ");
        int jam = scanner.nextInt();

        // Meminta pengguna memasukkan nilai menit
        System.out.print("Masukkan menit: ");
        int menit = scanner.nextInt();

        // Memanggil metode untuk menghitung sudut jarum jam
        int sudut = hitungSudutJarumJam(jam, menit);

        // Menampilkan hasil
        System.out.println("Sudut antara jarum jam pada jam " + jam + ":" + (menit < 10 ? "0" : "") + menit + " adalah: " + sudut + " derajat.");

        // Menutup objek Scanner
        scanner.close();
    }

    // Metode untuk menghitung sudut antara jarum jam
    public static int hitungSudutJarumJam(int jam, int menit) {
        // Konversi jam ke format 12 jam
        jam = jam % 12;

        // Menghitung sudut jarum jam
        int sudutJarumJam = Math.abs((60 * jam - 11 * menit) / 2);

        // Mengembalikan nilai sudut
        return sudutJarumJam;
    }
}
