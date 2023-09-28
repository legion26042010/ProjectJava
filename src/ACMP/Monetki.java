package ACMP;

import java.util.Scanner;

public class Monetki {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        int d=0,k=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }for (int i=0;i< arr.length;i++){
            if (arr[i] == 0) {
                d++;
            }
            if (arr[i] == 1) {
                k++;
            }
        }
        if (d > k) {
            System.out.println(k);
        }
        if (d < k) {
            System.out.println(d);
        }
    }
}
