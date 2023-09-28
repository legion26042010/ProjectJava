package CodeForces;

import java.util.Scanner;

public class Virajenie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int result1=a+b*c;
        int result2=a*(b+c);
        int result3=a*b*c;
        int result4=(a+b)*c;
        int result5=a+b+c;
        int max=Math.max(result1,Math.max(result2,Math.max(result3,Math.max(result4,result5))));
        System.out.println(max);
    }
}
