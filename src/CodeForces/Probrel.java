package CodeForces;

import java.util.Scanner;

public class Probrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++) arr[i]=scanner.nextInt();
            int max=0;
            int l=0;
            for (int i=0;i<arr.length;i++){
                if (arr[i]==0){
                    l++;
                }else {
                    max=Math.max(max,l);
                    l=0;
                }
            }
            System.out.println(Math.max(max,l));
        }
    }
}
