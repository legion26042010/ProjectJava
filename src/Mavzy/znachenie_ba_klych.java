package Mavzy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class znachenie_ba_klych {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Akmal");
        map.put(2,"Mahnoz");
        map.put(3,"Jamol");
        map.put(4,"Yossin");
        map.put(5,"Abdullo");
        map.put(6,"Mehyor");
        System.out.println("Value");
        int s = scanner.nextInt();
        System.out.println(map.get(s));
    }
}
