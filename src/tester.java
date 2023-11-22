    import java.util.*;

    public class tester {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           int t=scanner.nextInt();
           while (t-->0){
               String s=scanner.next();
               int x=scanner.nextInt();
               String hh=s.substring(0,2);
               String mm=s.substring(3,5);
               int h= (int) Math.ceil(x/60);
               int m=x%60;
               int res=0;
               while ((Integer.parseInt(hh)+h)!=Integer.parseInt(hh) && (Integer.parseInt(mm)+m)!=Integer.parseInt(mm)){
                   res++;
                   hh= String.valueOf(Integer.parseInt(hh)+h);
                   mm= String.valueOf(Integer.parseInt(mm)+m);
               }
               System.out.println(res);

           }
        }
    }
