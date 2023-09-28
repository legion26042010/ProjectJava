package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Umnojay_na_dva_deli_na_shest {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr=new PrintWriter(System.out);
        int t= Integer.parseInt(br.readLine());
            for (int i=0;i<t;i++){
                int n= Integer.parseInt(br.readLine());
                int res=0;
                while (n!=1){
                    if (n%6==0){
                        n=n/6;
                    }else {
                        n=n*2;
                        if (n%6!=0){
                            res=-1;
                            break;
                        }
                    }
                    res++;
                }
            pr.println(res);
            }
            pr.close();
    }
}