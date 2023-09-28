package CodeForces;

import java.util.Scanner;

public class Anton_i_monograniki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            if (s.equalsIgnoreCase("Tetrahedron"))
                sum=sum+4;
            if (s.equalsIgnoreCase("Cube"))
                sum=sum+6;
            if (s.equalsIgnoreCase("Octahedron"))
                sum=sum+8;
            if (s.equalsIgnoreCase("Dodecahedron"))
                sum=sum+12;
            if (s.equalsIgnoreCase("Icosahedron"))
                sum=sum+20;
        }
        System.out.println(sum);
    }
}
