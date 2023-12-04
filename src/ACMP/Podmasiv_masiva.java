package ACMP;

import java.util.Scanner;

public class Podmasiv_masiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        for (int i = 0; i < n2; i++) {
            int k1 = scanner.nextInt();
            int k2 = scanner.nextInt();
            String res = "";
            for (int j = k1 - 1; j < k2; j++) {
                res += arr[j] + " ";
            }
            System.out.println(res.substring(0, res.length() - 1));
        }
    }
}
