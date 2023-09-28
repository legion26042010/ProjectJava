package ACMP;

import java.util.Scanner;

public class Chislo_E {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();
    String n="2.7182818284590452353602875";
        if (a>25){
        System.out.println(n);
    }
    if (a==0){
        System.out.println(3);
    }else if (a<=25){
        System.out.println(n.substring(2,a));
        }
    }
}
