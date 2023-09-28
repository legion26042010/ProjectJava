package CodeForces;

import java.util.Scanner;

public class Korotkie_podstroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String s=scanner.next();
            String res="";
            for (int j=0;j<s.length();j+=2){
                res=res.concat(s.substring(j,j+1));
            }
            System.out.println(res.concat(s.substring(s.length()-1)));
        }
    }
}
