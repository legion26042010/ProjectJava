package CodeForces;

import java.util.Scanner;

public class Anton_i_Danik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String str = scanner.nextLine();
        int a = 0;
        int d = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase("A")) {
                a++;
            }
            if (str.substring(i, i + 1).equalsIgnoreCase("D")) {
                  d++;
            }
        }
        if (a > d) {
            System.out.println("Anton");
        }
        if (a < d) {
            System.out.println("Danik");
        }
        if (a == d) {
            System.out.println("Friendship");
        }
    }
}
