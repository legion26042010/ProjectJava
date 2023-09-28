package VirtualVjudge.Olipic.Ehson;

import java.util.Arrays;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int d = 0;
        String[] arr1 = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
        String[] arr = new String[Integer.parseInt(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();

        }
        Arrays.sort(arr);
        String[] ar = {};
        int g = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i].contains(arr1[j])) {
                    g = i;
                }

            }
        }
    }
}

