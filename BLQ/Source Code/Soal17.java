package BLQ;

import java.util.Scanner;

public class Soal17 {
    public static void main(String[] args) {
        //N N T N N N T T T T T N T T T N T N
        Scanner scanner = new Scanner(System.in);

        System.out.print("jalur : ");
        String[] arrJalur = scanner.nextLine().trim().toLowerCase().split(" ");

        int jmlGunung = 0;
        int jmlLembah = 0;
        int mdpl = 0;

        for (int i = 0; i < arrJalur.length; i++) {
            String jalurSekarang = arrJalur[i];
            if (jalurSekarang.equals("n")){
                mdpl++;
                if (mdpl == 0){
                    jmlLembah++;
                }
            } else if(jalurSekarang.equals("t")){
                mdpl--;
                if (mdpl == 0){
                    jmlGunung++;
                }
            }
        }

        System.out.println("Gunung : " + jmlGunung + ", Lembah : " + jmlLembah);
    }
}
