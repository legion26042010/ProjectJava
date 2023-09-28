package ACMP;

import java.util.Scanner;

public class Zarplata {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));
        System.out.println(max-min);
    }
}
