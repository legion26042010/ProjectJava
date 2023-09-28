package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Komandirovka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int no=0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add(scanner.nextInt());
            no=no+list.get(i);
        }
        int d = 0;
        int res = 0;
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < 12; i++) {
            if (d < a && d != a) {
                d = d + list.get(i);
                res++;
            }
        }
        if (no<a){
            System.out.println(-1);
        }else {
            System.out.println(res);
        }

    }
}
