package VirtualVjudge.Olimpic_2;

import java.util.Scanner;

public class olimpic_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int[] arr = new int[a];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
                if (arr[j] % 2 != 0) {
                    System.out.println(arr[j]);
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
