package VirtualVjudge.Olipic.Ehson;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[3];
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                arr[a - 1] = arr[a - 1] + 1;
            }
            int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
            if (max == arr[0]) System.out.println(arr[1] + arr[2]);
             else if (max == arr[1]) System.out.println(arr[0] + arr[2]);
             else System.out.println(arr[0] + arr[1]);

        }
    }
