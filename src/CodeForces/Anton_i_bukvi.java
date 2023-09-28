package CodeForces;

import java.io.*;
import java.util.*;

public class Anton_i_bukvi {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        Set<String> set=new HashSet<>();
        String s=bufferedReader.readLine();
        s=s.replace("{","");
        s=s.replace("}","");
        s=s.replace(",","");

        String[] arr=s.split(" ");
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        if (!s.equals("")){
            System.out.println(set.size());
        }else {
            System.out.println(0);
        }
    }
}
