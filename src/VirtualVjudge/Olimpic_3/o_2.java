package VirtualVjudge.Olimpic_3;
import java.util.Arrays;
import java.util.Scanner;

public class o_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<1;i++){
            if (arr[2] + arr[1] < arr[3] && arr[0] + arr[1] < arr[2]) {
                System.out.println("IMPOSSIBLE");
            } else if ((arr[2] + arr[1] == arr[3] && arr[0] + arr[1] <= arr[2]) || (arr[0] + arr[1] == arr[2] && arr[1] + arr[2] <= arr[3])) {
                System.out.println("SEGMENT");
            } else {
                System.out.println("TRIANGLE");
            }
        }
    }
}