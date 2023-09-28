package CodeForces;

import java.util.Scanner;

public class Konfeti_i_dve_sestri {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=0;i<t;i++){
            int n=scanner.nextInt();
            System.out.println((n-1)/2);
        }
    }
}
