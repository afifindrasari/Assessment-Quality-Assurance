package BLQ;

public class Soal22 {
    public static void main(String[] args) {
        int[] panjangLilin = {3, 3, 9, 6, 7, 8, 23};

        int lilinPertamaHabisMeleleh = lilinPertamaHabisMeleleh(panjangLilin);

        System.out.println("Lilin pertama yang habis meleleh: Lilin " + (lilinPertamaHabisMeleleh + 1));
    }

    public static int lilinPertamaHabisMeleleh(int[] panjangLilin) {
        int n = panjangLilin.length;
        int[] fibonacci = new int[n];

        // Menghitung deret Fibonacci
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Mencari lilin pertama yang habis meleleh
        int i = 0;
        while (i < n && panjangLilin[i] >= fibonacci[i]) {
            panjangLilin[i] -= fibonacci[i];
            i++;
        }

        return i;
    }
}
