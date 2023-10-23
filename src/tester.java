import java.util.Scanner;

class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int n = s.length();

            int start = 0;
            int end = 0;
            String longestSubstring = "";

            while (end < n) {
                if (s.substring(start, end + 1).equals(s.substring(end))) {
                    longestSubstring = s.substring(start, end + 1);
                } else {
                    start++;
                }

                end++;
            }

            System.out.println(longestSubstring);
        }

    }


}
