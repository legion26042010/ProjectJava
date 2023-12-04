import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long l=sc.nextInt();
            long r=sc.nextInt();
            long a=sc.nextInt();
            long res=Integer.MIN_VALUE;
            for (long i=l;i<=r;i++){
                long k=(i/a)+i%a;
                res=Math.max(res,k);
            }
            System.out.println(res);
        }
    }
}