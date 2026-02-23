import java.util.Deque;
import java.util.LinkedList;

public class DequePalindrome {
    public static void main(String[] args) {

        String str = "level";   // Hardcoded string

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until empty or one element left
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}