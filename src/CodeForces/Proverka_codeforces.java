package CodeForces;

import java.util.Scanner;

public class Proverka_codeforces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sc = "Codeforces";
        for (int i = 0; i < Integer.parseInt(s); i++) {
            String str = scanner.nextLine();
           if (str.equals("c")||str.equals("o")||str.equals("d")||str.equals("e")||str.equals("f")||str.equals("r")||str.equals("s")){
               System.out.println("YES");
           }else {
               System.out.println("NO");
           }

        }
    }
}
