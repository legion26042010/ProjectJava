package CodeForces;

import java.util.Scanner;

public class Schastlivoe_delenie {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr={47,74,744,477,774,447};
        String str="";
        for (int i=0;i<arr.length;i++){
            if (arr[i]==n){
                str="Yes";
            }else {
                str="No";
            }
        }
        System.out.println(str);
    }
}
