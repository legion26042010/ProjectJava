package CodeForces;

import java.util.Scanner;

public class Teatralnaya_ploshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        long sum = 1;

        if (n > a) {
            sum *= (n + a - 1) / a;
        }
        if (m > a) {
            sum *= (m + a - 1) / a;
        }
        System.out.println(sum);
    }

}