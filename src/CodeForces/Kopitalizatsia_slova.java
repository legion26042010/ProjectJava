package CodeForces;


import java.util.Scanner;

public class Kopitalizatsia_slova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1=scanner.nextLine();
        System.out.println(n1.substring(0,1).toUpperCase().concat(n1.substring(1,n1.length())));
    }
}