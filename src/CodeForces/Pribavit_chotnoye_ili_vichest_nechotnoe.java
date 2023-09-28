package CodeForces;

import java.util.Scanner;

public class Pribavit_chotnoye_ili_vichest_nechotnoe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=a-b;
            if (c<=0){
                if (c==0) {
                    System.out.println("0");
                }
                if (c!=0 && c%2==0){
                    System.out.println("2");
                }
                if (c!=0 && a%2!=0){
                    System.out.println("1");
                }
            }else {
                if (c==0){
                    System.out.println("0");
                }
                if (c!=0 && c%2!=0){
                    System.out.println("2");
                }
                if (c!=0 && c%2==0){
                    System.out.println("1");
                }
            }
        }
    }
}
