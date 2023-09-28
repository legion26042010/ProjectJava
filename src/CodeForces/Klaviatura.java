package CodeForces;

import java.io.*;
import java.util.Scanner;

public class Klaviatura {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String str=scanner.nextLine();
        String s="qwertyuiopasdfghjkl;zxcvbnm,./";
        if (a.equalsIgnoreCase("R")) {
            str = str.replace("q", "/");
            str = str.replace("w", "q");
            str = str.replace("e", "w");
            str = str.replace("r", "e");
            str = str.replace("t", "r");
            str = str.replace("y", "t");
            str = str.replace("u", "y");
            str = str.replace("i", "u");
            str = str.replace("o", "i");
            str = str.replace("p", "o");

            str = str.replace("a", "p");
            str = str.replace("s", "a");
            str = str.replace("d", "s");
            str = str.replace("f", "d");
            str = str.replace("g", "f");
            str = str.replace("h", "g");
            str = str.replace("j", "h");
            str = str.replace("k", "j");
            str = str.replace("l", "k");
            str = str.replace(";", "l");

            str = str.replace("z", ";");
            str = str.replace("x", "z");
            str = str.replace("c", "x");
            str = str.replace("v", "c");
            str = str.replace("b", "v");
            str = str.replace("n", "b");
            str = str.replace("m", "n");
            str = str.replace(",", "m");
            str = str.replace(".", ",");
            str = str.replace("/", ".");
            System.out.println(str);
        }else {
            String res="";
            for (int i=0;i<str.length();i++){
                int d=0;
                for (int j=0;j<s.length();j++){
                    if (str.substring(i,i+1).equalsIgnoreCase(s.substring(j,j+1))) d=j;
                }
                res=res.concat(s.substring(d+1,d+2));
            }
            System.out.println(res);
        }
    }
}