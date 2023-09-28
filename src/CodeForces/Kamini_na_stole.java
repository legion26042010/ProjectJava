package CodeForces;

import java.util.Scanner;

public class Kamini_na_stole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int d = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.length() == n && s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                d++;
            }
        }
        System.out.println(d);
    }
}
