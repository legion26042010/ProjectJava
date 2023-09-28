package CodeForces;

import java.util.Scanner;

public class Podschot_funksii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        if (n%2==0){
            System.out.println(n/2);
        }else {
            System.out.println((n/2+1)*-1);
        }
    }
}
