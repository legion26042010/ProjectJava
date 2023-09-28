package ACMP;

import java.util.Scanner;

public class BAsketbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1=scanner.nextInt();
        int b1=scanner.nextInt();
        int a2=scanner.nextInt();
        int b2=scanner.nextInt();
        int a3=scanner.nextInt();
        int b3=scanner.nextInt();
        int a4=scanner.nextInt();
        int b4=scanner.nextInt();
        int a=a1+a2+a3+a4;
        int b=b1+b2+b3+b4;
        if (a>b){
            System.out.println("1");
        }
        if (a<b){
            System.out.println("2");
        }
        if (a == b) {
            System.out.println("DRAW");
        }
    }
}
