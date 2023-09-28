package CodeForces;

import java.util.*;

public class Noutbuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int res=0;
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (a<b){
                res++;
            }
        }
        if (res>0){
            System.out.println("Happy Alex");
        }else {
            System.out.println("Poor Alex");
        }
    }
}
