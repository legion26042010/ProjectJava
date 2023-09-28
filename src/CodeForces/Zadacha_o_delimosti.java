package CodeForces;

import java.io.*;

public class Zadacha_o_delimosti {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr=new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++){
            int d=0;
            String s= br.readLine();
            String[] arr=s.split(" ");
            int a= Integer.parseInt(arr[0]);
            int b= Integer.parseInt(arr[1]);
            for (int j=0;j<b;j++){
                if (a%b!=0){
                    a=a+1;
                    d++;
                }
            }
            pr.println(d);

        }
        pr.close();
    }
}
