package java11.bronze;

import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.println(min+" "+max);
    }
}
