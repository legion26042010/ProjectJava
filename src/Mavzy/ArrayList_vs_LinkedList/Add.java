package Mavzy.ArrayList_vs_LinkedList;

import java.util.*;

public class Add {
    public void add(List<Integer> list){
        long start=System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            list.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
