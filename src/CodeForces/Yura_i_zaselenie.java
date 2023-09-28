package CodeForces;

import java.util.Scanner;

public class Yura_i_zaselenie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int result=0;
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (a+2<=b){
                result++;
            }
        }
        System.out.println(result);
    }
}
