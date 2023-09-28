package CodeForces;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chon_ili_nechot {
    public static void main(String[] args) {
        PrintWriter pr=new PrintWriter(System.out);
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long k=scanner.nextLong();
        String s="";
        List<Integer> list=new ArrayList<>();
        for (int i=1;i<=n;i+=2){
            list.add(i);
        }
        for (int i=2;i<=n;i+=2){
            list.add(i);
        }
        BigInteger a=BigInteger.valueOf(k);
        pr.println(list.get((int) k-1));
        pr.close();
    }
}
