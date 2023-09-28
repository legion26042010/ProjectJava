package CodeForces;

import java.util.*;

public class Neobhodimiy_ostatok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            for (int j = c / a; j >= 0; j--) {
                if (j * a + b <= c) {
                    System.out.println(j * a + b);
                    break;
                }
            }
        }
    }
}