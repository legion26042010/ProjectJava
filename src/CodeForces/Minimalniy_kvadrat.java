package CodeForces;

import java.util.Scanner;

public class Minimalniy_kvadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int s = a * b * 2;
            int max = Math.max(a, b);
            if (a == b) {
                System.out.println((a + b) * (a + b));
            } else {
                if (max * max >= s) {
                    System.out.println(max * max);
                } else {
                    System.out.println((max + 1) * (max + 1));
                }
            }
        }
    }
}