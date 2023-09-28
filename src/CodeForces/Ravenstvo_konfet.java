package CodeForces;

import java.util.*;

public class Ravenstvo_konfet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        for (int i=0;i<a;i++){
            int min=Integer.MAX_VALUE;
            int result=0;
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for (int j=0;j<arr.length;j++){
                arr[j]=scanner.nextInt();
             min=Math.min(min,arr[j]);
            }
            for (int k : arr) {
                result += k - min;
            }
            System.out.println(result);
        }
    }
}
