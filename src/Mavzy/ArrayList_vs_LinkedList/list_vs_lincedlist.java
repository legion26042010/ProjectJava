package Mavzy.ArrayList_vs_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list_vs_lincedlist {
    public static void main(String[] args) {
        List<Integer> arrayList =new ArrayList<>();
        List<Integer> linkedList =new LinkedList<>();
        String s="hello";
        Add jamol1=new Add();
        Remove jamol2=new Remove();
        Get jamol3=new Get();
        System.out.println("Раунд 1 метод add");
        System.out.print("ArrayList: ");
        jamol1.add(arrayList);
        System.out.print("LinkedList: ");
        jamol1.add(linkedList);
        System.out.println("");
        System.out.println("Раунд 2 метод remove");
        System.out.print("ArrayList: ");
        jamol2.remove(arrayList);
        System.out.print("LinkedList: ");
        jamol2.remove(linkedList);
        System.out.println("");
        System.out.println("Раунд 2 метод get");
        System.out.print("ArrayList: ");
        jamol3.get(arrayList);
        System.out.print("LinkedList: ");
        jamol3.get(linkedList);
    }
}
