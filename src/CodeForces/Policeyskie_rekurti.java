package CodeForces;

import java.util.Scanner;

public class Policeyskie_rekurti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int s=0;
        int d=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
            for (int i=0;i<arr.length;i++){
                if (arr[i]==-1){
                s++;
                }else {
                d++;
                }
            }
        System.out.println(s);
           }
}
