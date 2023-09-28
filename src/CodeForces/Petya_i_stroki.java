package CodeForces;

import java.util.*;
public class Petya_i_stroki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.next();
        s2 = scanner.next();
        String f = s1.toLowerCase();
        String s = s2.toLowerCase();
        if (f.compareTo(s) == 0) {
            System.out.println(0);
        }
        if (f.compareTo(s) > 0) {
            System.out.println(1);
        }
        if (f.compareTo(s) < 0) {
            System.out.println(-1);
        }
    }
}
