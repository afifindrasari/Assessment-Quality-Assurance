package BLQ;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input deret bilangan: ");
        String[] deret = scan.nextLine().trim().split(" ");

        scan.close();
        cara2(deret);
    }

    static void cara2(String[] deret) throws ParseException{
        int[] deretInt = new int[deret.length];
        for (int i = 0; i < deret.length; i++) {
            deretInt[i] = Integer.parseInt(deret[i]);
        }

        ///MEAN///
        double sum = Arrays.stream(deretInt).sum();
        double mean = sum / deretInt.length;
        System.out.println("Mean: " + mean);

        ///MEDIAN///
        Arrays.sort(deretInt);
        double median;
        if (deretInt.length % 2 == 0){
            int tengah1 = deretInt.length / 2 - 1;
            int tengah2 = deretInt.length / 2;
            median = (deretInt[tengah1] + deretInt[tengah2]) / 2.0;
        }
        else {
            int tengah = deretInt.length / 2;
            median = deretInt[tengah];
        }
        System.out.println("Median: " + median);

        ///MODUS///
        int maxFreq = 0;
        int modus = 0;
        for (int i = 0; i < deretInt.length; i++) {
            int freq = 1;
            for (int j = i+1; j < deretInt.length; j++) {
                if (deretInt[i] == deretInt[j]){
                    freq++;
                }
            }
            if (freq > maxFreq){
                maxFreq = freq;
                modus = deretInt[i];
            }
        }
        System.out.print("Modus: ");
        if (maxFreq == 1){
            System.out.println("Tidak ada modus");
        }
        else {
            System.out.println(modus);
        }
    }
}
