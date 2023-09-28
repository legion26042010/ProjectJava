package Mavzy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Qavsho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        String s = br.readLine();
        //{ ( ) }
        int q=s.length()/2;
        String a=s.substring(0,q);
        a=a.replace("[","]");
        a=a.replace("{","}");
        a=a.replace("(",")");
        String b=s.substring(q,s.length());
        String d="";
        for (int i=b.length()-1;i>=0;i--){
            d=d.concat(b.substring(i,i+1));
        }
        if (a.equalsIgnoreCase(d)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
