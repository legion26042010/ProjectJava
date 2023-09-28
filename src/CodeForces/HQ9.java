package CodeForces;

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int h=0;
        int q=0;
        int nine=0;
        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).equals("H")){
                h++;
            }
            if (s.substring(i,i+1).equals("Q")){
                q++;
            }
            if (s.substring(i,i+1).equals("9")){
                nine++;
            }
        }
        if (h>0 || q>0 || nine>0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
