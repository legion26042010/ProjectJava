package CodeForces;

import java.util.Scanner;

public class Sledushiy_raund {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] arr=new int[n];
        int j=0;
            for (int i=0;i<arr.length;i++){
                arr[i]=scanner.nextInt();
                if (arr[i]>=arr[k-1] && arr[i]!=0){
                    j++;
                }

            }
        System.out.println(j);
    }
}
