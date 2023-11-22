package Abramyan.MinMax;

import java.util.Scanner;

public class minmax_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int min=Integer.MAX_VALUE;
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=a*b;
            min=Math.min(min,s);
        }
        System.out.println(min);
    }
}
