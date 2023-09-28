package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int t=scanner.nextInt();
        int res=0;
        for (int i=0;i<t;i++){
            list.add(scanner.nextInt());
        }
        for (int i=0;i<t-1;i++){
            if (list.get(i)!=list.get(i+1)){
                res++;
            }
        }
        System.out.println(res+1);
    }
}
