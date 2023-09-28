package CodeForces;

import java.util.Scanner;

public class Devison {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        String[] arr1=new String[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            if (1900<=arr[i]){
                System.out.println("Division 1");
            }
            if (1600<=arr[i] && arr[i]<=1899){
                System.out.println("Division 2");
            }
            if (1400<=arr[i] && arr[i]<=1599){
                System.out.println("Division 3");
            }
            if (arr[i]<=1399){
                System.out.println("Division 4");
            }
        }
    }
}
