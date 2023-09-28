package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Daltonizm {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++){
            int a= Integer.parseInt(br.readLine());
            String b1=br.readLine();
            String b2=br.readLine();
            b1=b1.replace("B",".");
            b1=b1.replace("G",".");
            b2=b2.replace("B",".");
            b2=b2.replace("G",".");
            if (b1.equals(b2)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

