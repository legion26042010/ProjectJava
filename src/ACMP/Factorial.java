package ACMP;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        BigInteger res= BigInteger.valueOf(1);
        for (int i=1;i<=a;i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}
