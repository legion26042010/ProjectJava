package ACMP;

import java.math.BigInteger;
import java.util.Scanner;

public class Zoloto_plemini_abba {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger a=scanner.nextBigInteger();
        BigInteger b=scanner.nextBigInteger();
        BigInteger c=scanner.nextBigInteger();
        System.out.println(a.max(b.max(c)));
    }
}
