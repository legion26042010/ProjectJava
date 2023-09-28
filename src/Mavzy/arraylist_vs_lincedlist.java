package Mavzy;

import java.util.*;

public class arraylist_vs_lincedlist {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();
        System.out.println("Раунд 1 метод add");
        System.out.print("ArrayList: ");
        add(arrayList);
        System.out.print("LinkedList: ");
        add(linkedList);
        System.out.println("");
        System.out.println("Раунд 2 метод remove");
        System.out.print("ArrayList: ");
        remove(arrayList);
        System.out.print("LinkedList: ");
        remove(linkedList);
        System.out.println("");
        System.out.println("Раунд 2 метод get");
        System.out.print("ArrayList: ");
        get(arrayList);
        System.out.print("LinkedList: ");
        get(linkedList);
    }
    private static void add(List<Integer> list){
        long start=System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            list.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }


    private static void remove(List<Integer> list){
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
    private static void get(List<Integer> list){
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
