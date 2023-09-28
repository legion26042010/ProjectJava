package CodeForces;

import java.util.*;

public class Podarki {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n  =  sc.nextInt();
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();

        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(),i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(map.get(i) + 1);
        }
    }
}