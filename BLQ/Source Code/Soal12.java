package BLQ;

public class Soal12 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,7,1,1,5,6,1,8};

        System.out.print("Output: ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = 0;
                if (arr[j] < arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
