package CodeForces;

import java.util.Scanner;

public class Igra_s_fishkoy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=0;i<t;i++){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            if (n%2==0 || m%2==0){
                System.out.println("Tonya");
            }else {
                System.out.println("Burenka");
            }
        }
    }
}
