package CodeForces;

import java.util.Scanner;

public class Slovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n=scanner.nextLine();
        int u=0;
        int l=0;
        for (int i=0;i<n.length();i++){
            if (n.substring(i,i+1).equals(n.substring(i,i+1).toUpperCase())){
                u++;
            }else {
                l++;
            }
        }
        if (u>l){
            System.out.println(n.substring(0,n.length()).toUpperCase());
        }else {
            System.out.println(n.substring(0,n.length()).toLowerCase());
        }
    }
}