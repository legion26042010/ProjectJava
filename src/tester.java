import Job4j.GobertShild.Heritage.A;

import java.util.*;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            int res=0;
            for (int i = 0; i < arr.length; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (x == 0) {
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] % 2 == 0) {
                            arr[j] = arr[j] + y;
                        }
                    }
                }
            }
        }
    }
}
