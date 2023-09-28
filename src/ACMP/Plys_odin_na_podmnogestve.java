package ACMP;


import java.util.Arrays;
import java.util.Scanner;

public class Plys_odin_na_podmnogestve {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int[] arr={};
       for (int i=0;i<n;i++){
           int a=scanner.nextInt();
           arr= new int[a];
       }
       for (int j=0;j<arr.length;j++){
           arr[j]=scanner.nextInt();
       }
       Arrays.sort(arr);
        for (int j=0;j<arr.length;j++){
            int min=arr[0];
            int max=arr[arr.length-1];
            System.out.println(max-min);
        }
    }
}
