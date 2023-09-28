package ACMP;

import java.util.Scanner;

public class Chislo_fibonachi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] f = new int[n];
        int d=0;
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
            d=f[f.length-1]+f[f.length-2];
        }
        System.out.println(d);
    }
}
