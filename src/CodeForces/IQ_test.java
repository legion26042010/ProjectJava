package CodeForces;

import java.util.*;

public class IQ_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        String n1 = "";
        int s1 = 0;
        String n2 = "";
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                n1 = n1 + arr[i];
                s1++;
            } else {
                n2 = n2 + arr[i];
                s2++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (s2==1) {
                if (arr[i].equals(n2)) {
                    System.out.println(i + 1);
                }
            }else {
                if (arr[i].equals(n1)) {
                    System.out.println(i + 1);
                }
            }
        }
    }
}