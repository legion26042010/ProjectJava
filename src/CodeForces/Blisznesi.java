package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Blisznesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mon = 0;
        int res = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            sum -= arr[i];
            mon += arr[i];
            res++;
            if (mon > sum) {
                break;
            }
        }
        System.out.println(res);
    }
}
