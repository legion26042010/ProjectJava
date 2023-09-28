package CodeForces;

import java.util.Scanner;

public class Perevod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String result = "";
        for (int  i = str1.length()-1; i >=0; i--) {
            result=result.concat(str1.substring(i,i+1));
        }
        if (result.equalsIgnoreCase(str2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
