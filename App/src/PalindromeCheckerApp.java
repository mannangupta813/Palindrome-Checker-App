public class PalindromeCheck {
    public static void main(String[] args) {

        String str = "radar";   // Hardcoded string

        // Convert string to character array
        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (ch[start] != ch[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}