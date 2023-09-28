package CodeForces;

import java.util.Scanner;

public class Footbal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String b="";
        for (int i=0;i<a.length();i++){
            if (a.length()<7) {
                b="NO";
            } else if (a.substring(i,i+7).equals(1111111) || a.substring(i,i+7).equals(0000000)){
                b="NO";
            }else {
                b="YES";
            }
        }
        System.out.println(b);
    }
}