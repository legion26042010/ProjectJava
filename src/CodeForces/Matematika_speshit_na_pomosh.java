package CodeForces;

import java.util.*;

public class Matematika_speshit_na_pomosh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.replace("+", "");
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String str="";
        for (int i=0;i<arr.length;i++){
            str=str.concat(String.valueOf(arr[i])+"+");
        }
        System.out.println(str.substring(0,str.length()-1));
    }
}