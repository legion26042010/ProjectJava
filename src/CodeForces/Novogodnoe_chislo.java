package CodeForces;

import java.util.Scanner;

public class Novogodnoe_chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i=0;i<t;i++) {
            int n = scanner.nextInt();
            if (n / 2020 < n % 2020) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
