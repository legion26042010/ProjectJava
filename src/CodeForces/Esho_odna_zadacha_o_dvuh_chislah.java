package CodeForces;

import java.util.Scanner;

public class Esho_odna_zadacha_o_dvuh_chislah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int d = Math.abs(a - b);
            int res = d / 10;
            if (d % 10 != 0) {
                res++;
            }
            System.out.println(res);
        }
    }
}
