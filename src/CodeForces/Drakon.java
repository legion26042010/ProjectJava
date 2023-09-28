package CodeForces;

import java.util.*;

public class Drakon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer,Integer> map=new TreeMap<>();
        int Kirito=scanner.nextInt();
        int t=scanner.nextInt();
        String s="";
        int k1=0;
        for (int i=0;i<t;i++){
            map.put(scanner.nextInt(),scanner.nextInt());
        }
        int i=0;
        for (Integer key : map.keySet()) {
            if (key<=Kirito){
                Kirito+=map.get(key);
                i++;
            }else {
                break;
            }
        }
        if (i==t){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        System.out.println(i);
        }
    }

//2 5
//5 1
//2 1
//3 1
//1 1
//4 1