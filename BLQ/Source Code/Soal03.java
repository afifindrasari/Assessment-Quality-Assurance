package BLQ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        // dd/MM/yyyy-HH:mm
        // 27/01/2019-05:00:01	27/01/2019-17:45:03
        // 27/01/2019-07:03:59	27/01/2019-15:30:06
        // 27/01/2019-07:05:00	28/01/2019-00:20:21
        // 27/01/2019-11:14:23	27/01/2019-13:20:00
        System.out.print("Masuk parkir: ");
        String masuk = scan.nextLine().trim();

        System.out.print("Keluar parkir: ");
        String keluar = scan.nextLine().trim();

        scan.close();
        cara2(masuk,keluar);
    }
    static void cara2(String masuk, String keluar) throws ParseException{
        long tarif = 0;
        int countHari = 0;
        int countJam = 0;
        int perHari = 15000;
        int perJamPertama = 1000;
        int perJamBerikutnya = 8000;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
        Date dateMasuk = dateFormat.parse(masuk);
        Date dateKeluar = dateFormat.parse(keluar);

        long diffMSec = dateKeluar.getTime()-dateMasuk.getTime();
        long diffMin = diffMSec/(60*1000);

        while (diffMin >= 1440){
            countHari += 1;
            diffMin -= 1440;
        }
        while (diffMin >= 60){
            countJam += 1;
            diffMin -= 60;
        }
        tarif = (countHari * perHari);
        if (countJam <= 8){
            tarif = (tarif +(countJam * perJamPertama));
        }
        else if (countJam > 8) {
            tarif = (tarif + perJamBerikutnya);
        }
        System.out.println(countHari + " Hari " + countJam + " Jam " + diffMin + " Menit");
        System.out.println("Tarif: " + tarif);
    }
}
