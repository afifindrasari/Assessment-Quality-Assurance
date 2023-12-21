package BLQ;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        int[] array = {3,9,0,7,1,2,4};

        //N = 3 → 7 1 2 4 3 9 0
        //N = 1 → 9 0 7 1 2 4 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int rotasi = scanner.nextInt();
        for (int i = 0; i < rotasi; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[4] = temp;

            System.out.print("Rotasi ke-" + (i+1) + " : ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
