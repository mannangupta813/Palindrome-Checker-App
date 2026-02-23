import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class FIFOvsLIFO {
    public static void main(String[] args) {

        String str = "ABC";   // Hardcoded string

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue into Queue & Push into Stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        System.out.println("Dequeue (FIFO order):");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        System.out.println("\nPop (LIFO order):");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}