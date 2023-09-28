package CodeForces;

import java.io.*;
import java.util.*;

public class Maximum_v_tablice {
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> map=new HashMap<>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(bufferedReader.readLine());
        map.put(1,1);
        map.put(2,2);
        map.put(3,6);
        map.put(4,20);
        map.put(5,70);
        map.put(6,252);
        map.put(7,924);
        map.put(8,3432);
        map.put(9,12870);
        map.put(10,48620);
        System.out.println(map.get(a));
    }
}
