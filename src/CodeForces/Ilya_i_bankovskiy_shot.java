package CodeForces;

import java.util.Scanner;

public class Ilya_i_bankovskiy_shot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        String s= String.valueOf(a);
        String d1=s;
        String d2=s.substring(0,s.length()-1);
        String d3=s.substring(0,s.length()-2).concat(s.substring(s.length()-1,s.length()));
        System.out.println(Math.max(Integer.parseInt(d1),Math.max(Integer.parseInt(d2),Integer.parseInt(d3))));

    }
}
