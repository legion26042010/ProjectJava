package CodeForces;

import java.util.Scanner;

public class Soldat_i_banan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int w=scanner.nextInt();
        int tp=0;
        int i=1;
        while (i<=w){
            tp+=i*k;
            i++;
        }
        if (n>=tp){
            System.out.println(0);
        }else {
            System.out.println(tp-n);
        }

    }
}
