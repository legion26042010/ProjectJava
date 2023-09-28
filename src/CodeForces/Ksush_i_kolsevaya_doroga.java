package CodeForces;

import java.util.Scanner;

public class Ksush_i_kolsevaya_doroga {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] arr=new int[m];
        for (int i=0;i<m;i++){
            arr[i]=scanner.nextInt();
        }
        int res=0;
        for (int i=0;i<n-1;i++){
            for (int j=1;j<=arr[i];j++){
                res++;
            }
        }
        System.out.println(res);
    }
}
