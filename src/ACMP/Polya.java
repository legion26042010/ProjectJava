package ACMP;

import java.util.Random;
import java.util.Scanner;

public class Polya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        long a = scanner.nextLong();
       for (int i=0;i<a;i++){
           int s=random.nextInt(100)+1;
           int b=s;
           if (a<b){
               System.out.println("Menshe");
               a=scanner.nextLong();
           }
           if (a>b){
               System.out.println("Bolshe");
               a=scanner.nextLong();
           }
           if (a==b){
               System.out.println("Winer");
           }
       }
    }
}
