package CodeForces;

import java.util.Scanner;

public class Vigrat_v_lotoreyu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n / 100)+(n % 100 / 20)+(n % 20 / 10)+(n % 10 / 5)+n % 5);
    }
}
