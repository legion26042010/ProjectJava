package CodeForces;

import java.util.Scanner;

public class Urok_dozayna_uchimsya_u_matematiki {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a = scanner.nextLong();
        long x1=0;
        long x2=0;
        if (a%2==0) {
            x1 = a - 4;
            x2 = 4;
        }else {
            x1=a-9;
            x2=9;

        }
        System.out.println(x1+" "+x2);
    }
}
