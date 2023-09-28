package CodeForces;

import java.util.Scanner;

public class Mishka_i_igra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a1=0;
        int b1=0;
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (a>b){
                a1++;
            }
            if (a<b){
                b1++;
            }
        }
        if (a1>b1){
            System.out.println("Mishka");
        } else if (a1<b1){
            System.out.println("Chris");
        }else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
