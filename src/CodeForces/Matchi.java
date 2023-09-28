package CodeForces;

import java.util.Scanner;

public class Matchi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] comand1=new int[n];
        int[] comand2=new int[n];
        int res=0;
        for (int i=0;i<n;i++){
            comand1[i]=scanner.nextInt();
            comand2[i]=scanner.nextInt();
        }
        for (int i1=0;i1<comand1.length;i1++) {
            for (int i2 = 0; i2 < comand1.length; i2++) {
                if (comand1[i1] == comand2[i2]) {
                    res++;
                }
            }
        }
            System.out.println(res);
    }
}
