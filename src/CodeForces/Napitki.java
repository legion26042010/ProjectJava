package CodeForces;

import java.util.Scanner;

public class Napitki {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextDouble();
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=scanner.nextInt();
        }
        System.out.println(sum/n);
    }
}
