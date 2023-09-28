package CodeForces;

    import java.util.Scanner;

    public class Vesyolaya_shutka {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String  g1=scanner.nextLine();
            String  g2=scanner.nextLine();
            String  k=scanner.nextLine();
            int len1=g1.length()+g2.length();
            int len2=k.length();
            for (int i=0;i<g1.length();i++){
                k=k.replaceFirst(g1.substring(i,i+1),"");
            }
            for (int i=0;i<g2.length();i++){
                k=k.replaceFirst(g2.substring(i,i+1),"");
            }
            if (len1==len2 && k.equals("")){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
