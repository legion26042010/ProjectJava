package ACMP;

import java.util.Arrays;
import java.util.Scanner;

public class olimpiada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arr=new int[n];
        int n1=0,n3=0,n5=0;
        for (int i=0;i< arr.length;i++){
            arr[i]=scanner.nextInt();
            n5=n5+arr[i]+n5;
        }
        for (int i=0;i< arr.length;i++){
            n3=n3+arr[i]+n3;
        }
        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++){
            n1=n1+arr[i]+n1;
        }
        if (n1 <= n3 && n1 <= n5) {
            System.out.println(1);
        }else  if (n3 <= n1 && n3 <= n5) {
            System.out.println(2);
        }else {
            System.out.println(5);
        }
    }
}
