package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pokupateli {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        for (int i=0;i<a;i++){
            int n=Integer.parseInt(br.readLine());
            if (n%4==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
