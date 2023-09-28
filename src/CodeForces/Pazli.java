package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Pazli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);//5 7 10 10 12 22
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            int d = arr[i + n- 1] - arr[i];
            if (min > d) {
                min = d;
            }
        }
        System.out.println(min);
    }
}
