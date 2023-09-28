package ACMP;

import java.util.Scanner;

public class Krestiki_noliki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String a1, a2, a3, b1, b2, b3, c1, c2, c3;
        a1 = a.substring(0, 1);
        a2 = a.substring(1, 2);
        a3 = a.substring(2, 3);
        b1 = b.substring(0, 1);
        b2 = b.substring(1, 2);
        b3 = b.substring(2, 3);
        c1 = c.substring(0, 1);
        c2 = c.substring(1, 2);
        c3 = c.substring(2, 3);
        String str="";
        if ((a3.equals("X") && b2.equals("X") && c1.equals("X")) || ((a1.equals("X") && b2.equals("X") && c3.equals("X")))) {
            str="Win";
        }else if (a1.equals("X") && b1.equals("X") && c1.equals("X") || a2.equals("X") && b2.equals("X") && c2.equals("X") || a3.equals("X") && b3.equals("X") && c3.equals("X")){
            str="Win";
        }else  if (a1.equals("X") && a2.equals("X") && a3.equals("X") || b1.equals("X") && b2.equals("X") && b3.equals("X") || c1.equals("X") && c2.equals("X") && c3.equals("X")){
            str="Win";
        } else if ((a3.equals("O") && b2.equals("O") && c1.equals("O")) || ((a1.equals("O") && b2.equals("O") && c3.equals("O")))) {
                str="Lose";
            }else if (a1.equals("O") && b1.equals("O") && c1.equals("O") || a2.equals("O") && b2.equals("O") && c2.equals("O") || a3.equals("O") && b3.equals("O") && c3.equals("O")){
                str="Lose";
            }else  if (a1.equals("O") && a2.equals("O") && a3.equals("O") || b1.equals("O") && b2.equals("O") && b3.equals("O") || c1.equals("O") && c2.equals("O") && c3.equals("O")){
                str="Lose";
            }else {
            str="Draw";
        }
        System.out.println(str);
    }
}