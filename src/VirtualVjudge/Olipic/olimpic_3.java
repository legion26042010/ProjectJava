package VirtualVjudge.Olipic;

import java.util.Scanner;

public class olimpic_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String s = scanner.nextLine();
        int d = 0;
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String a = scanner.nextLine();
            for (int j = 0; j < a.length(); j++) {
                if (a.equalsIgnoreCase("....")) {
                    d += 4;
                }
                if (a.substring(i, i + 1).equalsIgnoreCase(".")) {
                    d++;
                }
            }
        }
        System.out.println(d);

    }
}
