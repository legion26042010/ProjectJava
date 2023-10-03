package Job4j.GobertShild;

public class OverloadDemo {
    void test(){
        System.out.println("NO parametr");
    }
    void test(int a){
        System.out.println("a= "+a);
    }
    void test(int a,int b){
        System.out.println("a and b = "+a+" "+b);
    }
    double test(double a){
        System.out.println("double: "+a);
        return a*a;
    }
}
        class Overload {
            public static void main(String[] args) {
                OverloadDemo over = new OverloadDemo();
                double res;

                over.test();
                over.test(10);
                over.test(10,20);
                res=over.test(123.25);
                System.out.println(res);


            }
        }