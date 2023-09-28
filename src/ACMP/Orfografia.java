package ACMP;
import java.util.*;
public class Orfografia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s="1234567890";
        s1=s1.replace(" ","");
        int d=0;
  for (int i=s1.length()-1;i>=0;i--){
      for (int j=0;j<s.length();j++){
          if (s1.substring(i,i+1).equals(s.substring(j,j+1))){
              d=i;
          }
      }
  }
        int a= Integer.parseInt(s1.substring(0,d+1));
        String s2=s1.substring(d+1,s1.length());
        System.out.println(s2.substring(0,a-1).concat(s2.substring(a,s2.length())));
    }
}
