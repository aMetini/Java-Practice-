import java.util.Scanner;

public class Solution3B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //boolean isPalindrome = true; // set boolean to true
        boolean isPalindrome = false;

        System.out.println("Please enter a word to determine if it is a palidrome!");
        String userInput = scanner.nextLine().toLowerCase();
 
        int i = 0, j = userInput.length() - 1;

        // while (i < j) {
        //     if (userInput.charAt(i) != userInput.charAt(j)) {
        //         isPalindrome = false; // boolean changes to false if this conditional statement is satisfied.
        //         break;
        //     }
        //         // increment first pointer i (beginning of input)
        //         // decrement second pointer j (end of input)
        //         i++;
        //         j--;
        // }
        while (i < j) {
            if (userInput.charAt(i) == userInput.charAt(j)) {
                isPalindrome = true;
                break;
            }
            i++;
            j--;
        }
        
        if (isPalindrome) {
            System.out.println("This text input " + userInput + " is a palindrome!");
        } else {
            System.out.println("This text input " + userInput + " is NOT a palindrome!");
        }
        
    }
    
}
