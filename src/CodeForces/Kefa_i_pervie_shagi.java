package CodeForces;

import java.util.Scanner;

public class Kefa_i_pervie_shagi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int[] arr=new int[t];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            if (i>=1 && i+1<t && arr[i-1]>arr[i] && arr[i+1]>arr[i]){
                System.out.println(i);
            }
        }

    }
}
