package CodeForces;

import java.util.*;

public class Detstab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set=new LinkedHashSet<>();
        String s = scanner.nextLine();
        String[] arr=s.split("WUB");
        String res= Arrays.toString(arr);
        res=res.replace("[","");
        res=res.replace("]","");
        String[] ar=res.split(", ");
        String result="";
        for (int i=0;i<ar.length;i++){
            result=result.concat(ar[i]+" ");
        }
        result = result.replace("  "," ");
        result = result.trim();
        System.out.println(result);
    }
}
//TheLestOfUs