package VirtualVjudge.Olimpic_3;

import java.util.Scanner;

public class o_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a1=scanner.nextLine();
        String a2=scanner.nextLine();
        String a3=scanner.nextLine();
       if (a1.substring(0,1).equals(a3.substring(2,3)) && a1.substring(1,2).equals(a3.substring(1,2)) &&
                a1.substring(2,3).equals(a3.substring(0,1)) && a2.substring(0,1).equals(a2.substring(2,3))){
            System.out.printf("YES");
        }
        else {
            System.out.printf("NO");
        }
    }
}
