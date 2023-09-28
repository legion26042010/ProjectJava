package ACMP;

import java.util.Scanner;

public class Napyrstke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n="ABC";
        String a=sc.nextLine();
        for (int i=0;i<a.length();i++){
            if (a.substring(i,i+1).equals("A")){
              n=n.substring(1,2).concat(n.substring(0,1)).concat(n.substring(2,3));
            }
           else if (a.substring(i,i+1).equals("B")){
                n=n.substring(0,1).concat(n.substring(2,3).concat(n.substring(1,2)));
            }
            else if (a.substring(i,i+1).equals("C")){
                n=n.substring(2,3).concat( n.substring(1,2).concat(n.substring(0,1)));
            }
        }
       if (n.substring(0,1).equals("A")){
           System.out.println(1);
       }else if (n.substring(1,2).equals("A")){
           System.out.println(2);
       }else if (n.substring(2,3).equals("A")){
           System.out.println(3);
       }
    }
}