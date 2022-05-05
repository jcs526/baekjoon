package java11.bronze;

import java.util.Scanner;

public class No2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int result;

        if(A==B&&B==C)
            result=10000+A*1000;
        else if(A==B)
            result=1000+100*A;
        else if(A==C)
            result=1000+100*A;
        else if(C==B)
            result=1000+100*C;
        else {
            int max = Math.max(A,B);
            max=Math.max(max,C);
            result = max*100;
        }
        System.out.println(result);
    }
}
