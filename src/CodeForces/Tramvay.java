package CodeForces;

import java.util.*;
public class Tramvay {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        List<Integer> list=new ArrayList<>();
        int d=0;
        for(int i=0;i<t;i++)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            d=d+a-b;
            list.add(Math.abs(d));
        }
        Collections.sort(list);

        System.out.println(list.get(t-1));

    }
}
