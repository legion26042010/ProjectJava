package ACMP;

import java.util.Scanner;

public class Arifmeticheskaya_progressia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        System.out.println(a+(b-a)*(c-1));
    }
}
