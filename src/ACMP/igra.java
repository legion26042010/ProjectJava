package ACMP;

import java.util.Scanner;

public class igra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n > 0 && n < 10) {
            System.out.println(n+"9"+(9-n));
        }
    }
}
