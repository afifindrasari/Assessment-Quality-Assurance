package BLQ;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        //Format 12 jam -> panjang 11 15:40:44
        //Format 24 jam -> panjang 8  03:40:44 PM

        //03:40:44 PM ---> 15:40:44 (24 jam)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Waktu : ");
        String input  = scanner.nextLine();

        String hasil = "";
        if (input.length() == 11){//Format 12 jam ke format 24 jam
            if (input.charAt(9) == 'A'){ //AM
                if (input.substring(0,2).equals("12")){
                    hasil = "00" + input.substring(2,8);
                } else {
                    hasil = input.substring(0,8);
                }
            } else if(input.charAt(9) == 'P'){ //PM
                if (input.substring(0,2).equals("12")){
                    hasil = input.substring(0,8);
                } else {
                    int jam = Integer.parseInt(input.substring(0,2));
                    jam += 12;
                    hasil = jam + input.substring(2,8);
                }
            }
        } else if (input.length() == 8){//Format 24 jam ke format 12 jam
            int jam = Integer.parseInt(input.substring(0,2));
            if (jam == 0){
                hasil = "12" + input.substring(2,8) + " AM";
            } else if (jam == 12) {
                hasil = input.substring(0,8) + " PM";
            } else if (jam > 0 && jam < 12){
                hasil = input.substring(0,8) + " AM";
            } else {
                jam -= 12;
                hasil = String.format("%02d",jam) + input.substring(2,8) + " PM";
            }
        }
        System.out.println(hasil);
    }
}
