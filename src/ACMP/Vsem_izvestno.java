package ACMP;

import java.util.Scanner;

public class Vsem_izvestno {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        int k=0;
        for (int i=0;i<a.length();i++){
            if (a.substring(i,i+1).equals("0")){
                k++;
            }
        }
        if (k>=1){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
