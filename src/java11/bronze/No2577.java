package java11.bronze;

import java.util.Scanner;

public class No2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int num = A*B*C;

        int[] result = new int[10];

        int rest;
        while (num>0){
            rest = num%10;
            num = num/10;
            result[rest]++;
        }

        for(int x : result){
            System.out.println(x);
        }
    }
}
