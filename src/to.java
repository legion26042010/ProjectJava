import java.util.*;

public class to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            int l=list.get(0)-k;
            if (l<=0) {
                list.remove(0);
            }else {
                list.remove(0);
                list.add(l);
            }
            System.out.println(list);
        }
    }
}
