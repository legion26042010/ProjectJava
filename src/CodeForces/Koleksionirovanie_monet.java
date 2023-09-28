package CodeForces;

import java.util.Scanner;

public class Koleksionirovanie_monet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        for (int i = 0; i < n1; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int n=scanner.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int min=Math.min(a,Math.min(b,c));
            int mid=(a+b+c)-(min+max);
            int res=(max-mid)+(max-min);
            int result=n-res;
            if (result%3==0 && result/3>=0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
