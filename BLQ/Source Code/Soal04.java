package BLQ;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int panjang = scanner.nextInt();

        int[] arrPrima = new int[panjang];
        int calonprima = 1;
        for (int i = 0; i < arrPrima.length;) {
            int prima = 0;
            for (int j = 1; j <= calonprima; j++) {
                if (calonprima%j == 0){
                    prima++;
                }
            }
            if (prima == 2){
                arrPrima[i] = calonprima;
                System.out.print(calonprima + " ");
                i++;
            }
            calonprima++;
        }
    }
}
