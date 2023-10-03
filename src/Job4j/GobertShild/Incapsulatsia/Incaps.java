package Job4j.GobertShild.Incapsulatsia;

public class Incaps {
    public static void main(String[] args) {
        pro pro=new pro();
        System.out.println(pro.getString());

    }
}

class pro{
    private String s="weerrq1" ;
    public String getString(){
        return s;
    }
}