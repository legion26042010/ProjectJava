package CodeForces;

import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=scanner.nextInt();
        }
        int r=0;
        int max=a[0];
        int min=a[0];
        for(int i=1;i<n;i++) {
            if(a[i]>max) {
                r++;
                max=a[i];
            }
            else if(a[i]<min) {
                r++;
                min=a[i];
            }
        }
        System.out.println(r);
    }
}
