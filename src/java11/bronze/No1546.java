package java11.bronze;

import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];
        int max = 0;
        double result = 0;

        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max)
                max = array[i];
        }


        for (int x : array) {
            result += (double) x / max * 100;
        }

        System.out.println(result/num);
    }
}
