import java.util.Scanner;

import javax.swing.SwingConstants;

public class App {
    public static void main(String[] args) throws Exception {
        // //Solution 1
        // MyOwnRandomSignature myRnd = new MyOwnRandomSignature();
        // int x = 3;
        // int y = 12;

        // for (int i = 0; i <= 10; i++) {
        //     System.out.println(myRnd.getRandomBetweenNumbers(x, y));
        // }

        //Solution 2
        // Person person = new Person("Amber", 40, "female", "American");

        // System.out.println(person);

        // //Solution 3
        // Person person2 = new Person("Amber", 40, "female", "American");
        // person2.setName("Amy");
        // person2.setAge(43);
        // person2.setGender("female");
        // person2.setNationality("American");
        
        // System.out.println(person2.getName());
        // System.out.println(person2.getAge());
        // System.out.println(person2.getGender());
        // System.out.println(person2.getNationality());
        // System.out.println(person2);

        // //Solution 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our calculator! Enter your first number.");
        double firstNumber = sc.nextDouble();
        System.out.println("Please enter your second number.");
        double secondNumber = sc.nextDouble();
        System.out.println("Please enter an operation: +, -, *, /.");
        char operator = sc.next().charAt(0);

        Calculator cal = new Calculator();
        cal.setFirstNumber(firstNumber);
        cal.setSecondNumber(secondNumber);

        switch (operator) {
            case '+':
            double addResult = cal.addition(cal.getFirstNumber(firstNumber), cal.getSecondNumber(secondNumber));
            System.out.println("The solution to your solution is " + addResult);
            break;

            case '-':
            double subResult = cal.subtraction(cal.getFirstNumber(firstNumber), cal.getSecondNumber(secondNumber));
            System.out.println("The solution to your solution is " + subResult);

            break;
            
            case '*':
            double multResult = cal.multiplication(cal.getFirstNumber(firstNumber), cal.getSecondNumber(secondNumber));
            System.out.println("The solution to your solution is " + multResult);

            break;

            case '/':
            double divResult = cal.division(cal.getFirstNumber(firstNumber), cal.getSecondNumber(secondNumber));
            System.out.println("The solution to your solution is " + divResult);

            break;

            default:
            System.out.println("You did not enter a mathmatical operator.");
        }

        //Solution 5
        Game game = new Game();

        game.runGame();
    }
}
