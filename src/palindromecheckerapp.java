import java.util.Scanner;

public class palindromecheckerapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        // Convert string into character array
        char[] chars = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        sc.close();
    }
}
