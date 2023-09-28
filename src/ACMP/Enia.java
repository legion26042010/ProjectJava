package ACMP;

import java.util.Scanner;

public class Enia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b, d;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        d = n * a * b * 2;
        System.out.println(d);
    }
}