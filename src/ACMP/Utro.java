package ACMP;

import java.util.Scanner;

public class Utro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String s = scanner.nextLine();
       String hh1=(s.substring(0,2));
       String mm1=(s.substring(3,5));
       String hh2=scanner.next();
       String mm2=scanner.next();
       int res1=Integer.parseInt(hh1)+Integer.parseInt(hh2);
       int res2=Integer.parseInt(mm1)+Integer.parseInt(mm2);
       while (res1-24>0){

       }

    }
}
