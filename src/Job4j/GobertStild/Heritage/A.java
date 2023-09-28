package Job4j.GobertStild.Heritage;

public class A {
    int i, j;

    void showij() {
        System.out.println("i and j" + i + " " + j);
    }
}

    class B extends A{
        int k;
        void showK(){
            System.out.println("k: "+k);
        }
        void ShowSum(){
            System.out.println("i+j+k: "+(i+j+k));
        }
    }
    class  Simplelnheritance{
        public static void main(String[] args) {
            A superOb=new A();
            B subOb=new B();

            superOb.i=10;
            superOb.j=20;
            System.out.println("SuperOb: ");
            superOb.showij();
            System.out.println();

            subOb.i=7;
            subOb.j=8;
            subOb.k=9;

            System.out.println("SubOb: ");
            subOb.showij();
            subOb.showK();
            System.out.println();

            System.out.println("i+j+k: ");
            subOb.ShowSum();

        }
    }
