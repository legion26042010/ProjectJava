package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Lubimaya_zadacha_Atlla {
    public static void main(String  [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String alp1="xyzwvutsrqponmlkjihgfedcba";
        String alp="abcdefghijklmnopqrstuvwxyz";
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            String s=scanner.next();
            int d=0;

            String[] arr=s.split("");
            Arrays.sort(arr);
            String s1= Arrays.toString(arr);
            s1=s1.replace("[","");
            s1=s1.replace("]","");
            s1=s1.replace(",","");
            s1=s1.replace(" ","");
            for (int j=0;j<s1.length();j++){
                for (int h=alp.length()-1;h>=0;h--){
                    if (s1.substring(j,j+1).equalsIgnoreCase(alp.substring(h,h+1))){
                        d=h;
                        break;
                    }
                }
            }
            System.out.println(d+1);
        }

    }
}
