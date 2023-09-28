package CodeForces;

import java.util.Scanner;

public class Kvadratnaya_stroka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String a = scanner.nextLine();
            if (a.length() % 2 == 0 && a.substring(0, a.length() / 2).equals(a.substring(a.length() / 2, a.length()))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
        }
    }
}
