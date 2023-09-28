package CodeForces;

import java.util.*;

public class Praznic_ravenstva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        int ma=0;
        int res=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            max=Math.max(max,arr[i]);
            list.add(arr[i]);
        }
        list.remove((Integer) max);
        for (int i=0;i<list.size();i++){
            res=res+(max-list.get(i));
        }
        System.out.println(res);
    }
}
