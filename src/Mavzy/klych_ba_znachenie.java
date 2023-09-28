package Mavzy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class klych_ba_znachenie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Akmal");
        map.put(2,"Mahnoz");
        map.put(3,"Jamol");
        map.put(4,"Yossin");
        map.put(5,"Abdullo");
        map.put(6,"Mehyor");


        System.out.println("Key");
        int number=s.nextInt();
        System.out.println(map.get(number));

    }
}