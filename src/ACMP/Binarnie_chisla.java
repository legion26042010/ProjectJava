package ACMP;

import java.util.Scanner;

public class Binarnie_chisla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = 0;
        for (int i = 0; i <= 13; i++) {
            if (Math.pow(2, i) == a) {
                System.out.println("YES");
                d++;
            } else if (d != 1 && i == 13) {
                System.out.println("NO");
            }
        }
    }
}
