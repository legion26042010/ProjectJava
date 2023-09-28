package CodeForces;

import java.util.Scanner;

public class Minuta_do_novogo_goda {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int chas=scanner.nextInt();
            int min=scanner.nextInt();
            int chas1=23-chas;
            int min1=60-min;
            System.out.println(chas1*60+min1);
        }
    }
}
