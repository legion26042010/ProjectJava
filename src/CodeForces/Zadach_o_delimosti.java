package CodeForces;

import java.util.Scanner;

public class Zadach_o_delimosti {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=0;i<t;i++){
            int a=scanner.nextInt();
            int v=scanner.nextInt();
            if(a%v==0)
                System.out.println(0);
            else
                System.out.println(v-(a%v));
        }
        }
    }
