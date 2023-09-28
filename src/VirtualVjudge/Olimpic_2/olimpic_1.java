package VirtualVjudge.Olimpic_2;

import java.util.Scanner;

public class olimpic_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i=0;i<a;i++){
            int n=scanner.nextInt();
            System.out.println((int) Math.pow(2,n)-1);
        }

    }
}
