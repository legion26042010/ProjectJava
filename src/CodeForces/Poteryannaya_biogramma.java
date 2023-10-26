package CodeForces;

import java.util.Scanner;

public class Poteryannaya_biogramma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        for (int i=0;i< Integer.parseInt(t);i++) {
            String n = scanner.nextLine();
            String s=scanner.nextLine();
            String[] arr=s.split(" ");
            String res="";
            String[] str=new String[arr.length];
            for (int j=0;j<arr.length-1;j++){
                if (arr[j].substring(1,2).equals(arr[j+1].substring(0,1))){
                    res=res+arr[j].substring(0,1);
                }else {
                    res=res+arr[j].substring(0,2);
                }
            }
            res+=arr[arr.length-1].substring(0,2);
            if (res.length()==Integer.parseInt(n)){
                System.out.println(res);
            }else {
                System.out.println(res+"a");
            }
        }
    }
}
