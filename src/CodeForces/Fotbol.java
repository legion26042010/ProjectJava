package CodeForces;

import java.util.Scanner;

public class Fotbol {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int d=0;
        for (int i=0;i<s.length();i++) {
            for (int j =s.length()-1; j > 0; j--) {
                if (s.substring(i,i+1).equals("1")){
                    d++;
                }
            }
        }
        System.out.println(d);
    }
}
