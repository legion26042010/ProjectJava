import java.util.HashSet;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashSet<Integer>set=new HashSet<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();

                if (set.contains(a)){
                    set.add(a+1);
                }
                else{
                    set.add(a);
                }
            }
            System.out.println(set.size());
        }
    }
}
