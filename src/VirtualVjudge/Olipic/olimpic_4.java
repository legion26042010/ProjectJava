package VirtualVjudge.Olipic;

import java.util.Scanner;

public class olimpic_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String result= String.valueOf(Integer.parseInt(s)/2050);
        String dev="";
        for (int i=0;i<result.length();i++){
            if (Integer.parseInt(result)%2==0){
            }else {
               dev="-1";
            }
        }
        System.out.println(dev);
    }
}
