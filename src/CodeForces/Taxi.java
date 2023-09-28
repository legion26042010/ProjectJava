package CodeForces;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int one = 0,two = 0 ,tree = 0, four = 0;
        int i = 0;
        while (i <arr.length) {
            arr[i]=sc.nextInt();
            if (arr[i] == 1) one++;
             else if (arr[i] == 2) two++;
             else if (arr[i] == 3) tree++;
             else if (arr[i] == 4) four++;
            i++;
        }
        int res=four + tree + (two * 2 + Math.max(one - tree, 0) + 3) / 4;
        System.out.println(res);
    }
}