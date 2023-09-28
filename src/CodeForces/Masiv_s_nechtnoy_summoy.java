package CodeForces;

import java.util.Scanner;

public class Masiv_s_nechtnoy_summoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int[] arr = new int[a];
            long sum1 = 0;
            long sum2 = 0;
            long sum = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
                sum = sum + arr[j];
                if (arr[j] % 2 != 0) {
                    sum1++;
                }
                if (arr[j] % 2 == 0) {
                    sum2++;
                }

            }
            if (sum % 2 != 0) {
                System.out.println("YES");
            } else {
                if (sum1 >= 1 && sum2 >= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
