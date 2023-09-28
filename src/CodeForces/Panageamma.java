package CodeForces;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Panageamma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> set=new TreeSet<>();
        int n=scanner.nextInt();
        String s = scanner.next().toLowerCase();
        for (int i=0;i<s.length();i++){
            set.add(s.substring(i,i+1));
        }
        if (set.size()==26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
