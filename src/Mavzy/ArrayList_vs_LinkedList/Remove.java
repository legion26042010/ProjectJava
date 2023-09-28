package Mavzy.ArrayList_vs_LinkedList;

import java.util.List;

public class Remove {
    public void remove(List<Integer> list){
        for (int i=0;i<10000;i++){
            list.add(i);
        }
        long start=System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            list.remove(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
