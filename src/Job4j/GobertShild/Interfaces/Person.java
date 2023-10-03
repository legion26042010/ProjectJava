package Job4j.GobertShild.Interfaces;

public class Person implements Info{
    public Person(String name) {
        this.name = name;
    }

    public String name;
    public void sayHellow(){
        System.out.println("Hello");
    }


    public void showInfo() {
        System.out.println("NAme is: "+this.name);
    }
}
