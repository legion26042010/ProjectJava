package Mavzy.ArrayList_vs_LinkedList;

import java.util.List;

public class Get {
    public void get(List<Integer> list){
        for (int i=0;i<10000;i++){
            list.add(i);
        }
        long start=System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            list.get(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
