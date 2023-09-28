package ACMP;

import java.util.*;

public class Kondecioner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Troom=scanner.nextInt();
        int Tcoud=scanner.nextInt();
        String s=scanner.next();
        int max=Math.max(Troom,Tcoud);
        int min=Math.min(Troom,Tcoud);
        if (s.equalsIgnoreCase("freeze")){
            System.out.println(min);
        }else if (s.equalsIgnoreCase("heat")){
            System.out.println(max);
        }else if (s.equalsIgnoreCase("auto")){
            System.out.println(Tcoud);
        }else if (s.equalsIgnoreCase("fan")){
            System.out.println(Troom);
        }
    }
}
