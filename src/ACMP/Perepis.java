package ACMP;

import java.util.Scanner;

public class Perepis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (b == 1) {
                max = Math.max(max, a);
            }
            if (max == a) res = i;
        }
        System.out.println(res==0?-1:res+1);
    }
}
