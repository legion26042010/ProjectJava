package CodeForces;

import java.util.Scanner;

public class Ugadivaniya_kletki_ot_Anti_Light {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i=0;i<a;i++){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            if (n==m){
                System.out.println(n-m);
            }else {
            System.out.println(Math.min(n,m));
        }
        }
    }
}
