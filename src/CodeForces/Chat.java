package CodeForces;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.matches(".*h.*e.*l.*l.*o.*")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
