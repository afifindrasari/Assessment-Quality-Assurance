package BLQ;

import java.util.Scanner;

public class Soal20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak awal antara A dan B: ");
        int jarakAwal = scanner.nextInt();

        int jarak = jarakAwal;
        String pemenangTerakhir = "";

        for (int i = 1; i <= 3 && jarak != 0; i++) {
            System.out.println("=== Suit ke-" + i + " ===");

            System.out.print("Masukkan suit A (Gun, Batu, Kertas): ");
            String suitA = scanner.next();

            System.out.print("Masukkan suit B (Gun, Batu, Kertas): ");
            String suitB = scanner.next();

            char suitAChar = suitA.charAt(0);
            char suitBChar = suitB.charAt(0);

            if (suitAChar == 'B' && suitBChar == 'G' || suitAChar == 'K' && suitBChar == 'B'
                    || suitAChar == 'G' && suitBChar == 'K') {
                // A menang, maju 2 langkah dan B mundur 1 langkah
                jarak -= 1;
                pemenangTerakhir = "A";
            } else if (suitBChar == 'B' && suitAChar == 'G' || suitBChar == 'K' && suitAChar == 'B'
                    || suitBChar == 'G' && suitAChar == 'K') {
                // B menang, mundur 1 langkah dan A maju 2 langkah
                jarak -= 1;
                pemenangTerakhir = "B";
            }

            System.out.println("Jarak setelah suit ke-" + i + ": " + jarak);
        }

        if (jarak == 0) {
            System.out.println("Pemenang akhir: " + pemenangTerakhir);
        } else {
            System.out.println("Pemenang akhir: Seri");
        }

        scanner.close();
    }
}
