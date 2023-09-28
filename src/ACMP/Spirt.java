package ACMP;

import java.util.Scanner;

public class Spirt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        a/= 2; b/= 6; c/=1;
        if (a > b) {
            a = b;
        }
        if (a > c) {
            a = c;
        }
        System.out.println(a);
    }
}
