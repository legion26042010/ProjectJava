package CodeForces;

import java.util.Scanner;

public class Fotografia_breyna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int C=0;
        int M=0;
        int Y=0;
        int W=0;
        int G=0;
        int B=0;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                String a=scanner.next();
                if (a.equalsIgnoreCase("C")){
                    C++;
                }if (a.equalsIgnoreCase("M")){
                    M++;
                }if (a.equalsIgnoreCase("Y")){
                    Y++;
                }if (a.equalsIgnoreCase("W")){
                    W++;
                }if (a.equalsIgnoreCase("G")){
                    G++;
                }if (a.equalsIgnoreCase("B")){
                    B++;
                }
            }
        }
        if (C!=0 ) {
            System.out.println("#Color");
        }else if (M!=0){
            System.out.println("#Color");
        }else if (Y!=0){
            System.out.println("#Color");
        }else if (B!=0){
            System.out.println("#Black&White");

        }else if (G!=0){
            System.out.println("#Black&White");

        }else if (W!=0){
            System.out.println("#Black&White");

        }


    }
}
