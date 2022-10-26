import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        try (Scanner inputVal = new Scanner(System.in)) {
            System.out.println("Please enter your age");
            int age = inputVal.nextInt();
            System.out.println("The age that you entered is " + age);

            if(age >= 18) {
                System.out.println("The user is not a minor!");
            }
            else {
                System.out.println("The user is a minor!");
            }
        }
    }
}
