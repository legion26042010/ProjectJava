package CodeForces;

import java.util.*;

public class Halk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i%2!=0) {
                System.out.print("I hate ");
            } else {
                System.out.print("I lowe ");
            }
            if (i==n) {
                System.out.print("it");
            }else {
                System.out.print("that");
            }
            System.out.print(" ");
            i++;
        }
    }
}
