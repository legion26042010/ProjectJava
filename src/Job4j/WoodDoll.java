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
            System.out.println("You number is: "+number);
            sum+=number;
            result.about();
        } else {
            System.out.println("You number is null");
        }
    }

    public static void SumOfNumber(){
        System.out.println(sum);
    }
    public static void main(String[] args) {
        WoodDoll num1 = new WoodDoll(null, 5);
        WoodDoll num2 = new WoodDoll(num1, 1);
        WoodDoll num3 = new WoodDoll(num2, 3);
        num3.about();
        System.out.println();
        System.out.print("The sum of number is: ");
        SumOfNumber();
    }
}
