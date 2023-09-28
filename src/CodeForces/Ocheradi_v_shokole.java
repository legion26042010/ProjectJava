package CodeForces;

import java.io.*;

public class Ocheradi_v_shokole {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] arr = n.split(" ");
        String s = br.readLine();
        for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
            s = s.replace("BG", "GB");
        }
        System.out.println(s);
    }
}
