package CodeForces;

import java.util.Scanner;

public class Igra_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int res=-1;
        int d=0;
        if (m % n == 0) {
            res = 0;
            d = m / n;
            while (d % 2 == 0){
                d /= 2; res++;
            }
            while (d % 3 == 0){
                d /= 3; res++;
            }
            if (d != 1) {
                res = -1;
            }
        }
        System.out.println(res);
    }
}