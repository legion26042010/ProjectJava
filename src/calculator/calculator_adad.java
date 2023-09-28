package calculator;

import java.util.Scanner;

public class calculator_adad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = 0;
        String d = "";
        int r = 0;
        int a=0;
        int b=0;
        for (int i = 0; i < s.length(); i++) {
            s=s.replace(" ","");
            if (s.substring(i, i + 1).equals("+")) {
                d = "+";
                r = i;
            }
            else if (s.substring(i, i + 1).equals("-")) {
                d = "-";
                r = i;
            }
            else if (s.substring(i, i + 1).equals("*")) {
                d = "*";
                r = i;
            }
            else if (s.substring(i, i + 1).equals("/")) {
                d = "/";
                r = i;
            }

        }
        a=Integer.parseInt(s.substring(0,r));
        b=Integer.parseInt(s.substring(r+1,s.length()));
        if (d.equals("+")){
            result=a+b;
        }else if (d.equals("-")){
            result=a-b;
        }else if (d.equals("*")){
            result=a*b;
        }else if (d.equals("/")){
            result=a/b;
        }

        System.out.println(result);
    }
}
