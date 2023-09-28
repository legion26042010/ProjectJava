package CodeForces;

import java.util.Scanner;

public class YES_ili_YES {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] arr=new String[Integer.parseInt(str)];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextLine();
            if (arr[i].equalsIgnoreCase("YES")){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
