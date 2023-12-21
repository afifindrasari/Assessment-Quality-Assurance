package BLQ;

import java.util.Scanner;

public class Soal18 {
    public static void main(String[] args) {
        // Jam makan dan kalori dari kue
        int[] jamMakan = {9, 13, 15, 17};
        int[] kaloriKue = {30, 20, 50, 80};

        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input waktu mulai olahraga Donna
        System.out.print("Jam mulai olahraga Donna (format 24 jam): ");
        int waktuMulaiOlahraga = scanner.nextInt();

        // Menutup objek Scanner
        scanner.close();

        // Menghitung total waktu olahraga dan waktu setiap aktivitas makan
        double totalWaktuOlahraga = 0;

        // Menghitung waktu dan kalori dari makanan yang dimakan
        for (int i = 0; i < jamMakan.length; i++) {
            // Selisih waktu dari memakan kue dan waktu olahraga (dalam jam)
            double selisihWaktu = waktuMulaiOlahraga - jamMakan[i];

            // Menghitung waktu olahraga untuk setiap kue yang dimakan
            double waktuOlahragaPerKue = 0.1 * kaloriKue[i] * selisihWaktu;

            // Menambahkan waktu olahraga per kue ke total waktu olahraga
            totalWaktuOlahraga += waktuOlahragaPerKue;
        }

        // Menambahkan waktu olahraga untuk minum air setiap 30 menit
        totalWaktuOlahraga += hitungWaktuMinumAir(30, waktuMulaiOlahraga);

        // Menambahkan waktu olahraga untuk minum air di akhir olahraga
        totalWaktuOlahraga += hitungWaktuMinumAir(0, waktuMulaiOlahraga);

        // Menghitung jumlah air yang diminum Donna
        int jumlahAir = hitungJumlahAir(totalWaktuOlahraga);

        System.out.println("Donna akan meminum " + jumlahAir + " cc air selama berolahraga.");
    }

    // Fungsi untuk menghitung waktu minum air
    private static double hitungWaktuMinumAir(int waktuMinumAir, int waktuMulaiOlahraga) {
        return waktuMinumAir / 60.0; // Mengubah waktu dari menit ke jam
    }

    // Fungsi untuk menghitung jumlah air yang diminum Donna
    private static int hitungJumlahAir(double totalWaktuOlahraga) {
        // Donna akan meminum 100 cc air setiap 30 menit
        int jumlahAirPer30Menit = 100;
        int intervalMinumAir = 30; // dalam menit

        // Menghitung jumlah air yang diminum Donna setiap 30 menit
        int jumlahAir = (int) (totalWaktuOlahraga / intervalMinumAir) * jumlahAirPer30Menit;

        // Donna juga meminum 500 cc di akhir olahraga
        jumlahAir += 500;

        return jumlahAir;
    }
}
