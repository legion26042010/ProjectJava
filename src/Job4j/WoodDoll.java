package Job4j;
public class WoodDoll {
    private WoodDoll result;
    private int number;

    private static int sum=0;
    public WoodDoll(WoodDoll result, int number) {
        this.result = result;
        this.number = number;
    }

    public void about() {

        System.out.println("Hello, my number is: " + number);
        if (result != null) {
            System.out.println("Sum of numbers is: "+number);
            sum+=number;
            result.about();
        } else {
            System.out.println("Sum of numbers is null");
        }
    }

    public static void SumOfNumber(){
        System.out.println(sum);
    }
    public static void main(String[] args) {
        WoodDoll little = new WoodDoll(null, 5);
        WoodDoll middle = new WoodDoll(little, 1);
        WoodDoll big = new WoodDoll(middle, 3);
        big.about();
        System.out.print("The som of number is: ");
        SumOfNumber();
    }
}
