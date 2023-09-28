package CodeForces;

import java.util.Scanner;

public class Slogniy_ekzamen_Arpa_i_naivniy_chit_Mehrdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int l = 0;
        if (n != 0) {
            if (n % 4 == 0) {
                l = 6;
            } else if (n % 4 == 1) {
                l = 8;
            } else if (n % 4 == 2) {
                l = 4;
            } else if (n % 4 == (3)) {
                l = 2;
            }
        }else {
            l=1;
        }
        System.out.println(l);
    }
}
