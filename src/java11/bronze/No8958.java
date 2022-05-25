package java11.bronze;

import java.util.Scanner;

public class No8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String[] array = new String[num];

        for (int i = 0; i < num; i++) {
            array[i] = scanner.next();
        }

        for (int i = 0; i < num; i++) {
            int score = 0;
            int sum = 0;
            for (int j = 0; j < array[i].length(); j++) {
                String[] str = array[i].split("");
                if (str[j].equals("O")) {
                    score++;
                } else if (str[j].equals("X")) {
                    score = 0;
                }
                sum += score;
            }
            System.out.println(sum);
        }
        for (int k = 1; k <257; k++){
            System.out.println("160."+k);
        }
    }


}
