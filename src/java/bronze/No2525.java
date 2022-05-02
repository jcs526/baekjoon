package java.bronze;

import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int timeHour = C/60;
        int timeMinute = C%60;

        A+=timeHour;
        B+=timeMinute;

        if(B>=60) {
            A += 1;
            B -= 60;
        }
        if(A>=24)
            A-=24;

        System.out.println(A+" "+B);

    }
}