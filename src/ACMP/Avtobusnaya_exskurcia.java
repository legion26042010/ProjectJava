package ACMP;

import java.util.Scanner;

public class Avtobusnaya_exskurcia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, d = 0, k = 0;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            d++;
            if (a <= 437 && n == 1) {
                System.out.println("Crash " + d);
            }
            if (a <= 437 && n > 1) {
                System.out.println("Crash " + d);
                break;
            } else if (a > 438) {
                k++;
            }
            if (k == n) {
                System.out.println("No crash");
            }
        }
    }
}
