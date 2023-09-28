import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Converter {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2,0.3));
    }
    public static double doubleExpression(double a, double b, double c) {
        return a+b;

    }

}