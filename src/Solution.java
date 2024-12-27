import java.util.ArrayList;

public class Solution {
    public static int a = 23432;
    public static int b = 93485395;


    public static boolean isPalindrome(int x) {
        boolean result;
        int count = 0;
        String line = Integer.toString(x);
        for (int i = 0; i < line.length(); i++) {
            for (int j = line.length() - 1; j >= 0; j--) {
                if (line.charAt(i) == line.charAt(j)) {
                    count ++;
                }
            }
        }
        if (count == 3){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(a));
    }
}