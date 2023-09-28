package CodeForces;

import java.util.Scanner;

public class Caps_lock {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if (s.substring(0,1).toLowerCase().equals(s.substring(0,1)) && s.substring(1,s.length()).toUpperCase().equals(s.substring(1,s.length()))){
            System.out.println((s.substring(0,1).toUpperCase()).concat(s.substring(1,s.length()).toLowerCase()));
        }else if (s.toLowerCase().equals(s.substring(0,s.length()))){
            System.out.println(s.toUpperCase());
        }else if ( s.toUpperCase().equals(s.substring(0,s.length()))){
            System.out.println(s.toLowerCase());
        }else {
            System.out.println(s);
        }
    }
}
