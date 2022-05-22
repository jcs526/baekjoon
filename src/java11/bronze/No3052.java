package java11.bronze;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class No3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        for(int x:array){
            int rest = x%42;
            set.add(rest);
        }

        System.out.println(set.size());
    }
}
