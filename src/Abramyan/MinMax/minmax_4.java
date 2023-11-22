package Abramyan.MinMax;

import java.math.BigInteger;
import java.util.*;

public class minmax_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger gcd=BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
         int res=Integer.parseInt(String.valueOf(gcd));
            System.out.println(res);
        }
    }