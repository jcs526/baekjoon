package java11.bronze;

import java.util.Scanner;

public class No4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr;

        for(int i = 0; i < num; i++) {
            int N = scanner.nextInt();

            arr = new int[N];

            double avg = 0;

            for(int j = 0; j < N; j++) {
                int val = scanner.nextInt();
                arr[j] = val;
                avg += val;
            }

            double mean = (avg/N);
            double count = 0;

            for(int j = 0; j < N; j++) {
                if(arr[j] > mean){
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/N)*100);
        }


    }
}
