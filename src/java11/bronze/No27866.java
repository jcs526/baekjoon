package java11.bronze;

import java.util.Scanner;

public class No27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int num = scanner.nextInt();

        System.out.println(str.substring(num-1,num));
    }
}
