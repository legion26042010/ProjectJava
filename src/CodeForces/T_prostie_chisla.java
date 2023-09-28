package CodeForces;

import java.util.Scanner;

public class T_prostie_chisla {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextInt();
        for (int i=0;i<n;i++){
            long t=scanner.nextInt();
            int res=0;
            for (int j=1;j<=t;j++){
                if (t%j==0){
                 res++;
                }
            }
            if (res==3){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
