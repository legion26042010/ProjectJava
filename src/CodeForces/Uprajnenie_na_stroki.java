package CodeForces;

import java.util.Scanner;

public class Uprajnenie_na_stroki {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        s=s.replace("A","");
        s=s.replace("a","");
        s=s.replace("O","");
        s=s.replace("o","");
        s=s.replace("Y","");
        s=s.replace("y","");
        s=s.replace("E","");
        s=s.replace("e","");
        s=s.replace("U","");
        s=s.replace("u","");
        s=s.replace("I","");
        s=s.replace("i","");
        char[] arr=s.toCharArray();
        String result="";
        for (int i=0;i<arr.length;i++){
            result=result.concat("."+arr[i]);
        }
        System.out.println(result.toLowerCase());
    }
}
