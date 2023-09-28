
import java.util.Scanner;

public class to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int num = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int f = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    f++;
                }
            }
            if (f > m) {
                m = f;
                num = arr[i];
            }
        }
        System.out.println(num);
    }
}
