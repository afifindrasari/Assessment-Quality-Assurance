package BLQ;

import java.util.Scanner;

public class Soal19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Sphinx of black quartz, judge my vow
        //Brawny gods just flocked up to quiz and vex him
        //Check back tomorrow; I will see if the book has arrived

        System.out.print("Kalimat: ");
        String str= in.nextLine();

        int count[] = new int[26];
        boolean flag = true;
        char ch;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);

            if(ch == ' ')
                continue;

            if(ch>='A' && ch<='Z'){
                count[ch-'A']++;
            } else if(ch>='a' && ch<='z'){
                count[ch-'a']++;
            }
        }

        for(int i=0; i<count.length; i++){
            if(count[i] == 0){
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Pangram");
        else
            System.out.println("Bukan Pangram");

    }
}
