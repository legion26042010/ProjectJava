package ACMP;

import java.util.Scanner;

public class Simpotichniy_uzor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        String c=scanner.nextLine();
        String d=scanner.nextLine();

        String a1=a.substring(0,1);
        String a2=a.substring(1,2);
        String a3=a.substring(2,3);
        String a4=a.substring(3,4);

        String b1=b.substring(0,1);
        String b2=b.substring(1,2);
        String b3=b.substring(2,3);
        String b4=b.substring(3,4);

        String c1=c.substring(0,1);
        String c2=c.substring(1,2);
        String c3=c.substring(2,3);
        String c4=c.substring(3,4);

        String d1=d.substring(0,1);
        String d2=d.substring(1,2);
        String d3=d.substring(2,3);
        String d4=d.substring(3,4);

        if (a1.equals("B") && a2.equals("B") && b1.equals("B") && b2.equals("B")){
            System.out.println("No");
        }else if (b1.equals("B") && b2.equals("B") && c1.equals("B") && c2.equals("B")){
            System.out.println("No");
        }else if (c1.equals("B") && c2.equals("B") && d1.equals("B") && d2.equals("B")){
            System.out.println("No");
        }else if (a2.equals("B") && a3.equals("B") && b2.equals("B") && b3.equals("B")){
            System.out.println("No");
        }else if (b2.equals("B") && b3.equals("B") && c2.equals("B") && c3.equals("B")){
            System.out.println("No");
        }else if (c2.equals("B") && c3.equals("B") && d2.equals("B") && d3.equals("B")){
            System.out.println("No");
        }else if (a3.equals("B") && a4.equals("B") && b3.equals("B") && b4.equals("B")){
            System.out.println("No");
        }else if (b3.equals("B") && b4.equals("B") && c3.equals("B") && c4.equals("B")){
            System.out.println("No");
        }else if (c3.equals("B") && c4.equals("B") && d3.equals("B") && d4.equals("B")){
            System.out.println("No");
        } else if (a1.equals("W") && a2.equals("W") && b1.equals("W") && b2.equals("W")){
            System.out.println("No");
        }else if (b1.equals("W") && b2.equals("W") && c1.equals("W") && c2.equals("W")){
            System.out.println("No");
        }else if (c1.equals("W") && c2.equals("W") && d1.equals("W") && d2.equals("W")){
            System.out.println("No");
        }else if (a2.equals("W") && a3.equals("W") && b2.equals("W") && b3.equals("W")){
            System.out.println("No");
        }else if (b2.equals("W") && b3.equals("W") && c2.equals("W") && c3.equals("W")){
            System.out.println("No");
        }else if (c2.equals("W") && c3.equals("W") && d2.equals("W") && d3.equals("W")){
            System.out.println("No");
        }else if (a3.equals("W") && a4.equals("W") && b3.equals("W") && b4.equals("W")){
            System.out.println("No");
        }else if (b3.equals("W") && b4.equals("W") && c3.equals("W") && c4.equals("W")){
            System.out.println("No");
        }else if (c3.equals("W") && c4.equals("W") && d3.equals("W") && d4.equals("W")){
            System.out.println("No");
        }else if (a.substring(0,4).equals("XXXX") && b.substring(0,4).equals("XXXX") && c.substring(0,4).equals("XXXX") && d.substring(0,4).equals("XXXX")){
            System.out.println("No");
        }else if (a.substring(0,4).equals("BBBB") && b.substring(0,4).equals("B") && c.substring(0,4).equals("BBBB") && d.substring(0,4).equals("BBBB")){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}