package Practice;

public class Palindrome {
        public static void main(String[] args) {
            String input = "nixin";

            if (isPalindrome(input)) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }
        }
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

