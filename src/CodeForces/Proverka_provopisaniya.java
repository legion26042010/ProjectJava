package CodeForces;

import java.util.Scanner;

public class Proverka_provopisaniya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(t); i++) {
            int T = 0;
            int i1 = 0;
            int m = 0;
            int u = 0;
            int r = 0;
            String n = scanner.nextLine();
            String str = scanner.nextLine();
            if (Integer.parseInt(n) == 5) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.substring(j, j + 1).equals("T")) {
                        T++;
                    }
                    if (str.substring(j, j + 1).equals("i")) {
                        i1++;
                    }
                    if (str.substring(j, j + 1).equals("m")) {
                        m++;
                    }
                    if (str.substring(j, j + 1).equals("u")) {
                        u++;
                    }
                    if (str.substring(j,j+1).equals("r")){
                        r++;
                    }
                }
                if (T==1 && i1==1 && m==1 && u==1 && r==1){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else {
                System.out.println("NO");
            }
        }
    }
}