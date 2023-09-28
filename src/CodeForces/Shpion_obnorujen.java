package CodeForces;

import java.io.IOException;
import java.util.*;

public class Shpion_obnorujen {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        for (int i=0;i<a;i++){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for (int j=0;j<arr.length;j++){
                arr[j]=scanner.nextInt();
            }
            int result=0;
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]!=arr[j+1] ){
                    result=j;
                }
            }
            if (arr[arr.length - 1] != arr[0]) {
                if (arr[arr.length-1]==arr[arr.length-2]){
                    result=0;
                } else {
                    result=arr.length-1;
                }
            }
            System.out.println(result+1);
        }
    }

}

//1
//3
//20 10 20

