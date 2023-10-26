import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                arr[i] = a;
            }
            int m = 1;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1] && arr[i] != 0) {
                    m++;
                } else {
                    set.add(arr[i]);
                    if (m >= 2) {
                        set.add(arr[i] * -1);
                    }
                    m = 1;
                }
            }
            set.add(arr[arr.length - 1]);
            if (m >= 2) {
                set.add(arr[arr.length - 1] * -1);
            }
            System.out.println(set.size());
        }
    }
}
