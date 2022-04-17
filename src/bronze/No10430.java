package bronze;

import java.util.Scanner;

public class No10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 =scanner.nextInt();
        int number2 =scanner.nextInt();
        int number3 =scanner.nextInt();

        System.out.println((number1+number2)%number3);
        System.out.println(((number1%number3)+(number2%number3))%number3);
        System.out.println((number1*number2)%number3);
        System.out.println(((number1%number3)*(number2%number3))%number3);
    }
}
