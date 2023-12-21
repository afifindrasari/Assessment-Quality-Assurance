package BLQ;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //N = 3 → 3 6 9
        //N = 4 → 4 8 12 16
        //N = 5 → 5 10 15 20 25
        int jumlah_deret,i;

        System.out.print("n: ");
        jumlah_deret = input.nextInt();

        for (i=1; i<=jumlah_deret; i++) {
            System.out.print(i*jumlah_deret + " ");
        }

        System.out.println();
    }
}
