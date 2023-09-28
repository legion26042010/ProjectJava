package CodeForces;

import java.util.Scanner;

public class Chubakka_i_chislo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("5","4").replace("6","3").replace("7","2").replace("8","1");
        if (s.substring(0,1).equals("9")){
            s=s.substring(1);
            System.out.println("9"+s.replace("9","0"));
        }else {
            System.out.println(s.replace("9","0"));
        }
    }
}

