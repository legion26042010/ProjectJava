import java.util.*;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        while (n-->0){
            list.add(scanner.nextInt());
        }
        int max=Integer.MIN_VALUE;
        Collections.sort(list);
        List<Integer> arr=new ArrayList<>();
        for (int i=0;i<k;i++){
           arr.add(list.get(i));
           max=Math.max(arr.get(i),max);
        }
        System.out.println(max+1);
    }
}
