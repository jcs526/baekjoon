package java11.bronze;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int N1,N2,N3;
        int cnt = 0;


        N1 =num;
        while (true){
            cnt++;

//            System.out.println("N1 : "+N1);
            if(N1>=10) {
                N2 = N1 / 10 + N1 % 10;
            }else {
                N2 =N1;
            }
//            System.out.println("N2 : "+N2);

                N3 = N1%10*10+N2%10;

//            System.out.println("N3 : "+N3);
           if(N3==num) {
               System.out.println(cnt);
               break;
           }else
//               System.out.println("num="+num+", N3="+N3);
//               System.out.println("실패"+cnt);
               N1=N3;

        }
    }
}
