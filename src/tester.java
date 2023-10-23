import java.util.Arrays;
import java.util.Scanner;

class tester {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int n=scanner.nextInt();
//            int k=scanner.nextInt();
//            int[] arr=new int[n];
//            for (int j=0;j<arr.length;j++){
//                arr[i]=scanner.nextInt();
//            }
//            Arrays.sort(arr);
//            int d=0, max=0;

        }

    public String zipZap(String str) {
        String s="";
        for (int i=0;i<str.length()-2;i++){
            if (str.substring(i,i+1).equals("z") && str.substring(i+2,i+3).equals("p")) {
                s+=str.substring(i,i+1)+str.substring(i+2,i+3);
            }else {
                s+=str.substring(i,i+1);
            }
        }
        return s;
    }
}