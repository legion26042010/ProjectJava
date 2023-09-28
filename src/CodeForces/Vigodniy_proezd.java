package CodeForces;

import java.util.Scanner;

public class Vigodniy_proezd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int v1=n*a;
        int v2=(n/m)*b+Math.min((n%m)*a, b);
        System.out.println( Math.min(v1,v2));
    }
}
