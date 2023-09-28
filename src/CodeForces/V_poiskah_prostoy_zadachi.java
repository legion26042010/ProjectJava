package CodeForces;

import java.util.Scanner;

public class V_poiskah_prostoy_zadachi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
       int s=0;
        for (int i=0;i<a;i++){
            int n=scanner.nextInt();
            if (n==1){
                s++;
            }
        }
        if (s==0){
            System.out.println("EASY");
        }else {
            System.out.println("HARD");
        }
    }
}
