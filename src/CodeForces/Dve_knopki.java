package CodeForces;

import java.util.Scanner;

public class Dve_knopki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int z=0;
        while (m>n){
            z++;
            if (m%2==1){
                m++;
            }else {
                m=m/2;
            }
        }
        z=z+n-m;
        System.out.println(z);
    }
}
