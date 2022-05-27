package java11.bronze;


public class No15596 {
    long sum(int[] a){
        long sum = 0;

        for(int i = 0; i <a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
