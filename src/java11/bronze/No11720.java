package java11.bronze;

import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String str = scanner.next();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += str.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}
