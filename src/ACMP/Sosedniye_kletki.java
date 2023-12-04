package ACMP;

import java.util.Scanner;

public class Sosedniye_kletki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(2);
            System.out.println(9);
        } else if (n == 64) {
            System.out.println(n - 8);
            System.out.println(n - 1);
        } else if (n == 57) {
            System.out.println(n - 8);
            System.out.println(n + 1);
        } else if (n == 8) {
            System.out.println(n - 1);
            System.out.println(n + 8);
        } else if (n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 7) {
            System.out.println(n - 1);
            System.out.println(n + 1);
            System.out.println(n + 8);
        } else if (n == 49 || n == 41 || n == 33 || n == 25 || n == 17 || n == 9) {
            System.out.println(n - 8);
            System.out.println(n + 1);
            System.out.println(n + 8);
        } else if (n == 56 || n == 48 || n == 40 || n == 32 || n == 24 || n == 16) {
            System.out.println(n - 8);
            System.out.println(n - 1);
            System.out.println(n + 8);

        } else if (n == 58 || n == 59 || n == 60 || n == 61 || n == 62 || n == 63) {
            System.out.println(n - 8);
            System.out.println(n - 1);
            System.out.println(n + 1);
        } else {
            System.out.println(n - 8);
            System.out.println(n - 1);
            System.out.println(n + 1);
            System.out.println(n + 8);
        }
    }
}
