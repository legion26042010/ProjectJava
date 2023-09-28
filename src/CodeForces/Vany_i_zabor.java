package CodeForces;

import java.util.Scanner;

public class Vany_i_zabor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int da=0;
        int no=0;
        for (int i=0;i<a;i++){
            int n=scanner.nextInt();
            if (n<=b){
                no++;
            }else {
                da++;
            }
        }
        System.out.println(no + da*2);
    }
}
