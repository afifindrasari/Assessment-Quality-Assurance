package BLQ;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        String replace = kalimat.replace(" ","");

        String[] split = replace.split("");
        for (int i = replace.length()-1; i >= 0 ; i--) {
            System.out.println("***"+split[i]+"***");
        }
    }
}
