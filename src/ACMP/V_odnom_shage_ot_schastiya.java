package ACMP;

import java.util.Scanner;

public class V_odnom_shage_ot_schastiya {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int max=Integer.MIN_VALUE;
            int r=0;
            while (n-->0){
                int a=scanner.nextInt();
                max=Math.max(max,a);
                if (max==a) r++;
            }
            if (r==1){
                if (max%2==0) System.out.println(max-1);
                else System.out.println(max);
            }else {
                System.out.println(0);
            }
        }
    }
}
