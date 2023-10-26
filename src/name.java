import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int[] arr =new int[n];
            long sum=0;
            long juft=0;
            long toq=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                if(arr[i]%2==0) juft++;
                else toq++;
            }
            while(q-->0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(a==1){
                    if(b%2!=0){
                        sum+=toq*b;
                        juft+=toq;
                        toq=0;
                    }
                    sum+=toq*b;
                }else{
                    if(b%2!=0){
                        sum+=juft*b;
                        toq+=juft;
                        juft=0;
                    }
                    sum+=juft*b;
                }
                System.out.println(sum);
            }
        }
    }
}