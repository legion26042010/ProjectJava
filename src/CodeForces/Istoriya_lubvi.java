package CodeForces;

import java.util.Scanner;

public class Istoriya_lubvi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=0;i<t;i++){
            String s=scanner.next();
            int res=0;
            if (!s.substring(0,1).equals("c")){
                res++;
            }
            if (!s.substring(1,2).equals("o")){
                res++;
            }
            if (!s.substring(2,3).equals("d")){
                res++;
            }
            if (!s.substring(3,4).equals("e")){
                res++;
            }
            if (!s.substring(4,5).equals("f")){
                res++;
            }
            if (!s.substring(5,6).equals("o")){
                res++;
            }
            if (!s.substring(6,7).equals("r")){
                res++;
            }
            if (!s.substring(7,8).equals("c")){
                res++;
            }
            if (!s.substring(8,9).equals("e")){
                res++;
            }
            if (!s.substring(9,10).equals("s")){
                res++;
            }
            System.out.println(res);
        }
    }
}
