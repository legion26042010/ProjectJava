package CodeForces;

import java.util.Scanner;

public class Priezd_generala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = 0, k = 0;
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                d = i;
            }
            if (min >= arr[i]) {
                min = arr[i];
                k = i;
            }
        }
        if (k < d) {
            System.out.println(d + n - k - 2);
        } else {
            System.out.println(d + n - k - 1);
        }
    }
}