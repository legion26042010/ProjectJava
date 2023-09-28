package Mavzy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mnogestva {
    public static void main(String[] args) {
        Set<Integer> hasset=new HashSet<>();
        for (int i=1;i<=10;i++){
            hasset.add(i);
        }

        Set<Integer> hasset1=new HashSet<>();
        for (int i=5;i<=15;i++){
            hasset1.add(i);
        }
        Set<Integer> h=new HashSet<>(hasset1);
        h.addAll(hasset);
        System.out.println(h);

//        Set<Integer> inter=new HashSet<>(hasset1);
//        inter.retainAll(hasset1);
//        System.out.println(inter);
    }
}
