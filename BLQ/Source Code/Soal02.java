package BLQ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        //dd/mm/yyy
        // 28/02/2016 - 07/03/2016
        // 29/04/2018 - 30/05/2018
        System.out.print("Input tanggal pinjam: ");
        String pinjam = scan.nextLine().trim();

        System.out.print("Input tanggal kembali: ");
        String kembali = scan.nextLine().trim();

        cara1(pinjam,kembali);
    }

    static void cara1(String pinjam, String kembali) throws ParseException {
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyy");
        Date timePinjam = timeFormat.parse(pinjam);
        Date timeKembali = timeFormat.parse(kembali);

        long totalMiliSecond = Math.abs(timeKembali.getTime()-timePinjam.getTime());
        long lama = (totalMiliSecond/(1000*60*60*24));
        int lama2 = (int) lama;
        System.out.println("Lama Pinjam: " + lama2 + " hari");
        int denda = 0;

        if (lama2 > 14){
            denda = (lama2 - 14) + (lama2 - 3) + (lama2 - 7) + (lama2 - 7);
        }
        else if (lama2 > 7) {
            denda = (lama2 - 3) + (lama2 - 7) + (lama2 - 7);
        }
        else if (lama2 > 3) {
            denda = (lama2 - 3);
        }
        else {
            denda = 0;
            System.out.println("Tidak ada denda!");
        }
        System.out.println("Denda: " + denda*100);
    }
}
