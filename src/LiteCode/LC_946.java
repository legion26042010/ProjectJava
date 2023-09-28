package LiteCode;

public class LC_946 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,5,3,2,1};

        System.out.println(validateStackSequences(a,b));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
       boolean res=true;
        for (int k : pushed) {
            for (int j = popped.length - 1; j >= 0; j--) {
                if (k == popped[j]) {
                res=true;
                }else {
                    res=false;
                }
            }
        }
        return res;
    }
}
