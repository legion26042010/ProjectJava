package CodeForces;

import java.util.Scanner;

public class Chestniy_playoff {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int d=scanner.nextInt();
            int max1=Math.max(a,b);
            int max2=Math.max(c,d);
            int min1=Math.min(a,b);
            int min2=Math.min(c,d);
            if (max1>min2 && max2>min1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


        }
    }
}
