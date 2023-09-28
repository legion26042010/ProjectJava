package CodeForces;

import java.util.Scanner;

public class Nomer_etaga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a <= 2) {
                System.out.println(1);
            } else if ((a - 2) % b == 0) {
                System.out.println((a - 2) / b + 1);
            } else {
                System.out.println((a - 2) / b + 2);
            }
        }
    }
}
