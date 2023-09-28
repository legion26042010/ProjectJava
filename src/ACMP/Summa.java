package ACMP;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int s = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                s = s + i;
            }
        } else {
            for (int i = 1; i >= n; i--) {
                s = s + i;
            }
        }
        System.out.println(s);

    }
}
