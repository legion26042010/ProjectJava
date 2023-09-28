package calculator;

import java.util.Scanner;

public class adad_rim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.substring(0, 1).equals("I") || s.substring(0, 1).equals("IV") || s.substring(0, 1).equals("V") || s.substring(0, 1).equals("IX") || s.substring(0, 1).equals("X")) {
            String[] arr1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            String[] ar1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII"
                    , "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
                    "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI",
                    "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII",
                    "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX"
                    , "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI",
                    "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
            String d = "";
            int r = 0;
            String a = "";
            String b = "";
            int g = 0;
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
                a = s.substring(0, r);
                b = s.substring(r + 1, s.length());
                for (int j = 0; j < arr1.length; j++) {
                    if (a.equals(arr1[j])) {
                        a = String.valueOf(arr2[j]);
                    }
                    if (b.equals(arr1[j])) {
                        b = String.valueOf(arr2[j]);
                    }
                }
            }
            int result = 0;
            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            if (d.equals("+")) {
                result = a1 + b1;
            } else if (d.equals("-")) {
                result = a1 - b1;
            } else if (d.equals("*")) {
                result = a1 * b1;
            } else if (d.equals("/")) {
                result = a1 / b1;
            }
            int z = 0;
            for (int q = 0; q < ar2.length; q++) {
                if (result == ar2[q]) {
                    z = q;
                }
            }
            if (result>=0){
                System.out.println(ar1[r]);
            }else {
                System.out.println("-"+arr1[r-1]);
            }
        }


        else {
            int result = 0;
            String d = "";
            int r = 0;
            int a = 0;
            int b = 0;
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
            a = Integer.parseInt(s.substring(0, r));
            b = Integer.parseInt(s.substring(r + 1, s.length()));
            if (d.equals("+")) {
                result = a + b;
            } else if (d.equals("-")) {
                result = a - b;
            } else if (d.equals("*")) {
                result = a * b;
            } else if (d.equals("/")) {
                result = a / b;
            }

            System.out.println(result);
        }
    }
}