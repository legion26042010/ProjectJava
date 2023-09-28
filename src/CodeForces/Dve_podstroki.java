package CodeForces;

import java.util.Scanner;

public class Dve_podstroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = s1;
        s1 = s1.replaceFirst("AB", "ab");
        s1 = s1.replaceFirst("BA", "ba");
        s2 = s2.replaceFirst("BA", "ba");
        s2 = s2.replaceFirst("AB", "ab");
        System.out.println(s1.contains("ab") && s1.contains("ba") || s2.contains("ab") && s2.contains("ba") ? "YES" : "NO");
    }
}
