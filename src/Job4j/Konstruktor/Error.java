package Job4j.Konstruktor;

public class Error {
    boolean active;
    int status;
    String massage;
    public Error(){

    }

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.massage = massage;
    }

    public void ShowAll(){
        System.out.println(active);
        System.out.println(status);
        System.out.println(massage);
    }

    public static void main(String[] args) {
        Error error=new Error(true,12,"jamol");
        error.ShowAll();
    }
}
