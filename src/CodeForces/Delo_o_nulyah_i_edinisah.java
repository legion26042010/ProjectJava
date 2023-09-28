package CodeForces;

import java.util.Scanner;

public class Delo_o_nulyah_i_edinisah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        int zeroes = 0;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            if (s.substring(i,i+1).equals("0")) {
                zeroes++;
            } else {
                ones++;
            }
        }

        int res = Math.abs(zeroes - ones);
        System.out.println(res);
    }
}
