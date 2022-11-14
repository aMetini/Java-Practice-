import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rev = "";
        boolean isPalindrome;

        System.out.println("Please enter a word to determine if it is a palidrome!");
        String userInput = scanner.nextLine().toLowerCase();
        char[] charInput = userInput.toCharArray();
        rev = new StringBuilder(new String(charInput)).reverse().toString();

        // if (userInput.equals(rev)) {
        //     isPalindrome = true;
        //     System.out.println("You input " + userInput + ". " + "This is a palindrome!");
        // }
        // else {
        //     isPalindrome = false;
        //     System.out.println("You input " + userInput + ". " + "This is NOT a palindrome!");
        // }
        isPalindrome = userInput.equals(rev);

        if (isPalindrome == true) {
            System.out.println("This text input " + userInput + " is a palidrome!");
        }
        else {
            System.out.println("This text input " + userInput + " is NOT a palidrom!");
        }

    }
}
