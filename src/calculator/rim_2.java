package calculator;

import java.util.Scanner;

public class rim_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
         String[] arr1 = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] arr2 = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String d = "";
        String a = "";
        String b = "";
        int a1 = 0;
        int b1 = 0;
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            s = s.replace(" ", "");
            if (s.substring(i, i + 1).equals("+")) {
                d = "+";
                r = i;
            } else if (s.substring(i, i + 1).equals("-")) {
                d = "-";
                r = i;
            } else if (s.substring(i, i + 1).equals("*")) {
                d = "*";
                r = i;
            } else if (s.substring(i, i + 1).equals("/")) {
                d = "/";
                r = i;
            }
        }
        a = s.substring(0, r);
        b = s.substring(r + 1, s.length());
        for (int j = 0; j < arr1.length; j++) {
            for (int add1 = 0; add1 < a.length(); add1++) {
                if (a.substring(add1, add1 + 1).equals(arr1[j])) {
                    a1 = a1 + arr2[j];
                }
            }

            for (int add2 = 0; add2 < b.length(); add2++) {
                if (b.substring(add2, add2 + 1).equals(arr1[j])) {
                    b1 = b1 + arr2[j];
                }
            }
        }

        if (d.equals("+")) {
            System.out.println(a1 + b1);
        } else if (d.equals("-")) {
            System.out.println(a1 - b1);
        } else if (d.equals("*")) {
            System.out.println(a1 * b1);
        } else if (d.equals("/")) {
            System.out.println(a1 / b1);
        }
    }
}
