import java.util.*;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(scanner.nextInt());
                b.add(scanner.nextInt());
            }
            String s= b.toString().replace(", ","");
            s=s.replace("[","").replace("]","");
            int max=Integer.MIN_VALUE;
            int res=0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) > 10) {
                    a.remove(j);
                    b.remove(j);
                }
                max= Math.max(max,b.get(j));
            }
            String Max= String.valueOf(max);
            System.out.println(s.indexOf(Max)+1);
        }
    }
}
