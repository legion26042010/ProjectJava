package CodeForces;

import java.util.Scanner;

public class Nechotnoe_mnojestvo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int n = scanner.nextInt();
            int k=0;
            for (int j = 0; j < n*2; j++) {
                int s=scanner.nextInt();
                if (s%2!=0){
                    k++;
                }
            }
            if ((k%n)==0 && k!=0 && (k/n)%2!=0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
