package CodeForces;

import java.util.Scanner;

public class Oleg_i_Radion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String m2 = String.valueOf(m);
        String m1 = "";
        for (int i = 0; i < n; i++) {
            if (m == 10) {
                m1 = m1.concat(String.valueOf(1));
            } else {

                m1 = m1.concat(String.valueOf(m));
            }
        }
        if (m == 10) {
            if (n < m2.length()) {
                System.out.println(-1);
            } else {
                System.out.println(m1.substring(0,m1.length()-1).concat("0"));
            }
        } else {
            if (n < m2.length()) {
                System.out.println(-1);
            } else {
                System.out.println(m1);
            }
        }
    }
}
