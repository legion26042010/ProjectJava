package CodeForces;

import java.util.*;

public class Marafon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++) {
            int res=0;
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int d=scanner.nextInt();
            if (a<b) res++;
            if (a<c) res++;
            if (a<d) res++;
            System.out.println(res);
        }
    }
}
