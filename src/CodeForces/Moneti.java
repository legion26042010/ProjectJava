package CodeForces;

import java.util.Scanner;

public class Moneti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         long x = 0;
         long y = 0;
        long t = scanner.nextLong();
        for (int i=0;i<t;i++){
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            if (n % 2 != 0 && k % 2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
