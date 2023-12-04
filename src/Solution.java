import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(hammingWeight(000000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        String s= String.valueOf(Integer.toOctalString(n));
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("1")) res++;
        }
        return res;
    }
}
