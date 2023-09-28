package Mavzy;

class SomeTreed extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
public class Potoki {
    public static void main(String[] args) {
        SomeTreed test=new SomeTreed();
                test.start();
    }
}
