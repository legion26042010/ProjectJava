package CodeForces;

import java.util.Scanner;

public class Po_seredine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int min=Math.min(a,Math.min(b,c));
            int max=Math.max(a,Math.max(b,c));
            int mid=(a+b+c)-(min+max);
            System.out.println(mid);
        }
    }
}
