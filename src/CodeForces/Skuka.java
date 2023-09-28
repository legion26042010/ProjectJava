package CodeForces;

import java.util.Scanner;

public class Skuka {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int s=0;
        for (int i=0;i<a;i++){
            int n=scanner.nextInt();
            if (a%2==0){
                if (n%2==0){
                    s=s+n;
                }
            }else {
                if (n%2!=0){
                    s=s+n;
                }
            }
        }
        System.out.println(s);
    }
}
