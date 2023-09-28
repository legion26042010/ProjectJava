package CodeForces;

import java.util.*;

public class Ne_smeshi_moi_podkovi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int v=0;
        if (a==b || a==c || a==d){
            v++;
        }
         if ( b==a || b==c || b==d){
            v++;
        }
         if (c==a || c==b || c==d){
            v++;
        }
         if (d==a || d==b || d==c){
            v++;
        }
         if ((a==d && b==c && a!=b) || (a==c && b==d && a!=b) || (a==b && c==d && a!=c)){
             System.out.println(2);
         }else if (v-1<=0){
            System.out.println(0);
        }else {
            System.out.println(v-1);
        }
    }
}
