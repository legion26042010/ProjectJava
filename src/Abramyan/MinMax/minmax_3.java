package Abramyan.MinMax;

import java.util.Scanner;

public class minmax_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int max=Integer.MIN_VALUE;
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=a*b;
            max=Math.max(max,s);
        }
        System.out.println(max);
    }
}
