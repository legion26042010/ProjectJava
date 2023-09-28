package calculator;

import java.util.*;

public class adad_ba_rim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int[] arr2 = {1, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] arr1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        for (int j = 0; j < arr2.length; j++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.substring(i, i + 1).equals(arr1[j])) {
                    a = a + arr2[j];
                }
            }
        }
    }
}