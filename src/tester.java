import java.util.*;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String[] arr=new String[n];
            for (int i = 0; i < n; i++) {
                arr[i]=scanner.next();
            }
            String res = "";
            System.out.println(Arrays.toString(arr));
        }
    }
}
