package bronze;

import java.util.Scanner;

public class No11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #"+i+": "+(a+b));
        }
    }
}
