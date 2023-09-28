package CodeForces;

import java.util.Scanner;

public class Hipster_vasya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 0, sum;
        while (n != 0 && m != 0) {
            n = n - 1;
            m = m - 1;
            c++;
        }
        if (n == 0)
            sum = m / 2;
        else
            sum = n / 2;
        System.out.println(c + " " + sum);
    }
}