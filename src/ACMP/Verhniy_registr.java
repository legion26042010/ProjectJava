package ACMP;

    import java.util.Scanner;

    public class Verhniy_registr {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();
            int d=0;
       for (int i=0;i<s.length();i++){
           if (s.substring(i,i+1).equals("0")){
               d++;
           }
       }
            System.out.println(d);
        }
    }
