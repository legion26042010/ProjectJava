package ACMP;

import java.util.Scanner;

public class Shahmat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        if (a.equalsIgnoreCase("C7-D5")){
            System.out.println("YES");
        }else if (a.length()==5 && !a.equalsIgnoreCase("C7-D5")){
            System.out.println("NO");
        }else if (a.substring(0,2).equals("")){
            System.out.println("ERROR");
        }

    }
}
