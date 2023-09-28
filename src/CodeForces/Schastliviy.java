package CodeForces;

import java.util.Scanner;

public class Schastliviy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
       for (int i=0;i<Integer.parseInt(n);i++){
           String a=scanner.nextLine();
           int a1=Integer.parseInt(a.substring(0,1));
           int a2=Integer.parseInt(a.substring(1,2));
           int a3=Integer.parseInt(a.substring(2,3));
           int b1=Integer.parseInt(a.substring(3,4));
           int b2=Integer.parseInt(a.substring(4,5));
           int b3=Integer.parseInt(a.substring(5,6));
           if (a1+a2+a3==b1+b2+b3){
               System.out.println("YES");
           }else {
               System.out.println("NO");
           }
       }
    }
}
