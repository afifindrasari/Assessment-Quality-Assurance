package BLQ;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Soal16 {
    public static void main(String[] args) {
        // Daftar makanan dan harganya
        String[] menu = {"Tuna sandwich", "Spaghetti carbonara", "Tea pitcher", "Pizza", "Salad"};
        int[] harga = {42000, 50000, 30000, 70000, 30000};

        // Inisialisasi total harga makanan
        int totalHargaMakanan = 0;

        // Inisialisasi harga tuna
        double hargaTuna = 0;

        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menghitung total harga makanan
        for (int i = 0; i < harga.length; i++) {
            System.out.print("Berapa porsi " + menu[i] + " yang dipesan? ");
            int porsi = scanner.nextInt();
            totalHargaMakanan += (harga[i] * porsi);

            // Menghitung harga tuna khusus
            if (menu[i].equals("Tuna sandwich")) {
                hargaTuna = harga[i] * porsi;
            }
        }

        // Menghitung pajak dan service
        double pajak = 0.1 * totalHargaMakanan;
        double service = 0.05 * totalHargaMakanan;
        double totalYangHarusDibayar = pajak + service + totalHargaMakanan;

        // Menampilkan total harga makanan, pajak, dan service dengan format rupiah
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("\nDetail Pembayaran:");
        System.out.println("Total harga makanan: " + formatter.format(totalHargaMakanan));
        System.out.println("Pajak (10%): " + formatter.format(pajak));
        System.out.println("Service (5%): " + formatter.format(service));
        System.out.println("TOTAL YANG HARUS DIBAYAR:" + formatter.format(totalYangHarusDibayar) + "\n");

        // Menampilkan jumlah yang harus dibayar oleh teman yang lebih murah dan yang tidak lebih murah
        double pembayaranTemanMurah = (totalYangHarusDibayar - hargaTuna) / 4;
        double pembayaranTemanBiasa = (totalYangHarusDibayar - pembayaranTemanMurah) / 3;

        System.out.println("Jumlah yang harus dibayar oleh teman yang lebih murah: " + formatter.format(pembayaranTemanMurah));
        System.out.println("Jumlah yang harus dibayar oleh teman yang tidak lebih murah: " + formatter.format(pembayaranTemanBiasa));

        // Menutup objek Scanner
        scanner.close();
    }
}
