package VirtualVjudge.Olipic;

import java.util.Scanner;

public class olimpic_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String str = scanner.nextLine();
            if (str.substring(i, i + 1).equalsIgnoreCase("U")) {
                u++;
            }
            if (str.substring(i, i + 1).equalsIgnoreCase("D")) {
                d++;
            }
            if (str.substring(i, i + 1).equalsIgnoreCase("L")) {
                l++;
            }
            if (str.substring(i, i + 1).equalsIgnoreCase("R")) {
                r++;
            }
        }
        if (u>=1 || d>=1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
