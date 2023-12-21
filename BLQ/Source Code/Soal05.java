package BLQ;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int panjang = scanner.nextInt();

        int satu = 0;
        int dua = 1;
        int[] arrFibo = new int[panjang];
        for (int i = 0; i < arrFibo.length; i++) {
            if (i==0){
                arrFibo[i] = satu;
            }
            else if (i == 1) {
                arrFibo[i] = dua;
            }
            else {
                arrFibo[i] = arrFibo[i-2] + arrFibo[i-1];
            }
            System.out.print(arrFibo[i] + " ");
        }
    }
}
