package Job4j;

public class Battery {
    public int load;

    public Battery(int load) {
        this.load = load;
    }
    public String about(){
        return "My charge: "+load+"%";
    }
    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        first.exchange(second);
        System.out.println("First." + second.about());
        System.out.println("Second." + first.about());

    }
}
