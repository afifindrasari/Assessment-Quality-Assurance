package BLQ;

import java.util.Arrays;
import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 2 4 7 8 6 9
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Inputkan index ke-"+(i+1)+" ");
            array[i]= scanner.nextInt();
        }
        Arrays.sort(array);
        int terkecil = 0;
        int terbesar = 0;
        for (int i = 0; i <array.length ; i++) {
            if (i<=3){
                terkecil=terkecil+array[i];
            }
            else{
                terbesar=terbesar+array[i];
            }
        }
        System.out.println("Nilai minimal: " + terkecil + " dan " + "Nilai maksimal: " + terbesar);
    }
}
