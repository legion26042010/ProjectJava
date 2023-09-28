package CodeForces;

import java.util.Scanner;

public class Peremeshenie_skobok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=0;i<t;i++){
            int a = scanner.nextInt();
            String s=scanner.next();
            int res=0;
            for (int j=0;j<s.length();j++){
                if (s.substring(j,j+1).equals("(")){
                    res++;
                }else if (res>0) {
                    res--;
                }
            }
            System.out.println(res);
        }
    }
}
