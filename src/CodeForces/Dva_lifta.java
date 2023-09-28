package CodeForces;

import java.util.Scanner;

public class Dva_lifta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int p;
            if (b >= c) p = b - 1;
            else p = c - b + c - 1;
            if (a == 1) System.out.println(1);
            else if (a - 1 > p) System.out.println(2);
            else if (a - 1 < p) System.out.println(1);
            else System.out.println(3);

        }
    }

}
