package CodeForces;

import java.util.Scanner;

public class Novogdnie_svechi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = a;
        while (a >= b) {
            d += a / b;
            a = (a / b) + (a % b);
        }
        System.out.println(d);
    }
}
