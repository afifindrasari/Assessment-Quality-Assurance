package BLQ;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kata: ");
        String kata = scanner.nextLine();

        boolean isPalindrom = true;
        for (int i = 0; i < kata.length(); i++) {
            char karakterkiri = kata.charAt(i);
            char karakterkanan = kata.charAt(kata.length()-1-i);

            if (karakterkiri != karakterkanan){
                System.out.println("Bukan kata palindrom");
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom == true){
            System.out.println("Kata palindrom");
        }
    }
}
