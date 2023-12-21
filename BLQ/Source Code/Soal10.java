package BLQ;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Susilo Bambang Yudhoyono
        //Rani Tiara
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        String[] splitkata = nama.split(" ");

        for (int i = 0; i < splitkata.length; i++) {
            String[] splithuruf = splitkata[i].split("");
            for (int j = 0; j < splithuruf.length; j++) {
                if (j==0){
                    System.out.print(splithuruf[j]);
                }
                if ( j== splithuruf.length-1) {
                    System.out.print("***" + splithuruf[j] + " ");
                }
            }
        }
    }
}
