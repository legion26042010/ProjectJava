package VirtualVjudge;

import java.util.Scanner;

public class Prostaya_summa_masiva {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int result=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            result=result+arr[i];
        }
        System.out.println(result);
    }
}
