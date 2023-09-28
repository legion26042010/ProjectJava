package VirtualVjudge.Olipic.Ehson;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = new String[Integer.parseInt(n)];
        int maxF = 0;
        String  num = "";
        for (int i = 0; i < arr.length; i++) {
            int f = 0;
            arr[i] = scanner.nextLine();
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    f++;
                }
                if (f > maxF) {
                    maxF = f;
                    num = arr[i];
                }
            }
        }
        System.out.println(num);

    }
}