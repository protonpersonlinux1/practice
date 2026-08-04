import java.util.ArrayList;

public class substringP {

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static void partition(String s, ArrayList<String> current) {
        if (s.length() == 0) {
            System.out.println(current);
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            String first = s.substring(0, i);

            if (isPalindrome(first)) {
                current.add(first);
                partition(s.substring(i), current);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "aab";
        partition(s, new ArrayList<>());
    }
}