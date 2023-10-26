package CodeForces;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Selochislennoe_raznobrazie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Set<Integer> set = new LinkedHashSet<>();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                arr[i]=a;
            }
            Arrays.sort(arr);
            int l=1;
            for (int i=0;i<arr.length-1;i++){
                if (arr[i]==arr[i+1]){
                    l++;
                }else {
                    set.add(arr[i]);
                    if (l>=2){
                        set.add(arr[i]*-1);
                    }
                    l=1;
                }
            }
            set.add(arr[arr.length-1]);
            if (l>=2){
                set.add(arr[arr.length-1]*-1);
            }
            System.out.println(set.size());
        }
    }
}
