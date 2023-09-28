package CodeForces;

import java.util.Scanner;

public class Bistriy_matematic {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        String result="";
        for (int i=0;i<a.length();i++){
            if (!a.substring(i,i+1).equals(b.substring(i,i+1))){
                result=result.concat("1");
            }else {
                result=result.concat("0");
            }
        }
        System.out.println(result);
    }
}
