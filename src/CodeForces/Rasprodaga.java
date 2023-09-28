package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Rasprodaga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int m1 = 0;
        int res = 0;
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            if (a <= 0) {
                list.add(a);
            }
        }
        Collections.sort(list);
        if (list.size()>m) {
            for (int i = 0; i < m; i++) {
                res += list.get(i);
            }
        }else {
            for (int i=0;i<list.size();i++){
                res+=list.get(i);
            }
        }
        System.out.println(Math.abs(res));
    }
}
