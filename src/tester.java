import java.util.*;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr={ "Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        double num=n;
        try {
            double number=((num%5)/5);
            String nums= String.valueOf(number).replace("0","").replace(".","");
            int res= Integer.parseInt(nums);
            System.out.println(arr[res-2]);
        }catch (NumberFormatException formatException){
            System.out.println(arr[0]);
        }

    }
}
