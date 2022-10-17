import java.util.Scanner;

public class SayMyName {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your first name: ");
        String fName = input.nextLine();
        System.out.println("Please enter your last name: ");
        String lName = input.nextLine();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Thank you. Your name is \n" + fName+" " + lName + ", and your age is " + age);
    }
}
