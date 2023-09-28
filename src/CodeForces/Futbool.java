package CodeForces;

import java.util.Scanner;

public class Futbool {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int fa=0;
        int d=1;
        for (int i=1;i<s.length();i++){
           if (s.charAt(i)==s.charAt(i-1)) d++;
           else d=1;
            if (d==7){
                fa=1;
                System.out.println("YES");
                break;
            }
        }
        if (fa==0) System.out.println("NO");
    }
}
