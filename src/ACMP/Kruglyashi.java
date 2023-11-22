package ACMP;

import java.util.Scanner;

public class Kruglyashi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='8') res+=2;
            if (s.charAt(i)=='0') res++;
            if (s.charAt(i)=='6') res++;
            if (s.charAt(i)=='9') res++;
        }
        System.out.println(res);
    }
}
