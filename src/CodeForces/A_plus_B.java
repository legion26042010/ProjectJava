package CodeForces;

import java.util.Scanner;

public class A_plus_B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String n =scanner.nextLine();
        for (int i=0;i<Integer.parseInt(n);i++){
            String str=scanner.nextLine();
            System.out.println(Integer.parseInt(str.substring(0,1))+Integer.parseInt(str.substring(2,3)));
        }
    }
}
