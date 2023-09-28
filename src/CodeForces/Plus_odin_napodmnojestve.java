package CodeForces;

import java.io.*;
import java.util.*;

public class Plus_odin_napodmnojestve {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
                min=Math.min(min,arr[j]);
                max=Math.max(max,arr[j]);

            }
            System.out.println(max-min);
        }
    }
}
