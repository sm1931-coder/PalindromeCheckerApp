import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class palindromecheckerapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        // Queue for FIFO
        Queue<Character> queue = new LinkedList<>();

        // Stack for LIFO
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        sc.close();
    }
}
