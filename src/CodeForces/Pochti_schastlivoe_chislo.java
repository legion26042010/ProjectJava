package CodeForces;

import java.util.Scanner;

public class Pochti_schastlivoe_chislo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int a=scanner.nextInt();
       String s= String.valueOf(a);
       String res="";
       for (int i=0;i<s.length();i++) {
           if (a % 4 == 0 || a % 7 == 0 || a%47==0 || a%477==0 || a%474==0 || a%774==0 || a%747==0)
               res = "YES";
           else
               res = "NO";
       }
        System.out.println(res);
    }
}
