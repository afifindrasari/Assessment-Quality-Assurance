package BLQ;

import java.util.Scanner;

public class Soal21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang lintasan: ");
        int lintasanPanjang = scanner.nextInt();

        // Menentukan letak lubang (misalnya, di tengah lintasan)
        System.out.print("Masukkan letak lubang: ");
        int letakLubang = scanner.nextInt();

        System.out.println("Gambarkan lintasan:");
        printLintasan(lintasanPanjang, letakLubang);

        int st = 0; // Stamina awal
        int d = 0;  // Distance awal

        // Menyimpan urutan langkah
        int[] steps = new int[lintasanPanjang]; // Ukuran disesuaikan dengan panjang lintasan

        // Iterasi sampai mencapai ujung lintasan atau kehabisan stamina atau masuk lubang
        int i = 0;
        while (d < lintasanPanjang && st >= 0) {
            System.out.print("Masukkan langkah (W untuk Walk, J untuk Jump): ");
            char langkah = scanner.next().toLowerCase().charAt(0); // Ubah ke huruf kecil

            // Cobalah untuk melompat jika langkah adalah 'j' dan stamina mencukupi
            if (langkah == 'j') {
                st -= 2;
                d += 3;
                steps[i++] = 1; // 1 menandakan langkah Jump
            } else if (langkah == 'w'){
                // Jika tidak melompat atau tidak cukup stamina, berjalan saja
                st += 1;
                d += 1;
                steps[i++] = 0; // 0 menandakan langkah Walk
            }

            // Cetak nilai stamina dan jarak setiap langkah
            System.out.println("Langkah ke-" + i + ": Stamina = " + st + ", Jarak = " + d);

            // Cek apakah stamina habis atau mencapai ujung lintasan
            if (st == 0 || d >= lintasanPanjang || d == letakLubang) {
                break; // Keluar dari loop jika permainan selesai
            }
        }

        // Jika berhasil mencapai ujung lintasan
        if (d >= lintasanPanjang) {
            System.out.println("Selamat, Anda berhasil mencapai ujung lintasan!");
            printResult(steps);
        } else {
            // Jika gagal mencapai ujung lintasan
            System.out.println("FAILED");
        }
    }

    public static void printLintasan(int lintasanPanjang, int letakLubang) {
        for (int i = 0; i < lintasanPanjang; i++) {
            if (i + 1 == letakLubang) {
                System.out.print("O");
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }

    public static void printResult(int[] result) {
        System.out.println("Langkah yang diperlukan untuk mencapai ujung lintasan:");
        for (int step : result) {
            System.out.print((step == 0 ? "Walk" : "Jump") + " ");
        }
    }
}
