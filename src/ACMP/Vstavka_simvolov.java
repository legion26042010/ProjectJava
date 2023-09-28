package ACMP;

import java.util.Scanner;

public class Vstavka_simvolov {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=   scanner.nextLine();
        s=s.replace("","#");
        System.out.println(s.substring(1,s.length()-1));
    }
}
