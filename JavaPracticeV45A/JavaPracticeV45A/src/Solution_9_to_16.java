import java.util.*;

public class Solution_9_to_16 {
    public static void main(String[] args) throws Exception {
        // //Solution 9
        // int exponent;
        // int calculation;
        // Scanner scan = new Scanner(System.in);

        // try {
        // System.out.println("Please enter an exponent number to calculate the equation 2n");
        // exponent = scan.nextInt();
        // calculation = (int) Math.pow(2, exponent);
        // } catch (Exception e) {
        //     System.out.println("You have entered an invalid number.");    
        //}

        // System.out.println("The answer to this problem is: " + calculation);

        // //Solution 10   // Will only work when given an integer rather than a double. InputMismatchException
        // double radius;
        // double area = 0;
        // Scanner sc = new Scanner(System.in);
        // try {
        //     System.out.println("Please enter a radius to calculate the area of a circle.");
        //     radius = sc.nextDouble();
        
        //     System.out.println("You have entered: " + radius);
        //     area = Math.PI * Math.pow(radius, 2.0);
        // } catch(InputMismatchException exception) {
        //     System.out.println("You have entered an invalid number.");
        // }
        // System.out.println("The area of your circle is: " + area);

        // //Solution 11
        // Random random = new Random();
        // int[] noArray = new int[30];
        // int counter = 0;

        // for(int i = 0; i < noArray.length; i++) {
        //     noArray[i] = random.nextInt(11);
        //     if(noArray[i] == 5) {
        //         counter ++;
        //     }
        //     System.out.println(noArray[i]);
        // }
        // System.out.println("The number five has appeared " + counter + " times");

        // //Solution 12
        // boolean[] beliefArr = new boolean[10];
        // int yes = 0;
        // int no = 0;
        // Random rand = new Random();

        // for (int i = 0; i < beliefArr.length; i++) {
        //     beliefArr[i] = rand.nextBoolean();
        //     if(beliefArr[i] == true) {
        //         yes++;
        //     }else {
        //         no++;
        //     }
        // }
        // System.out.println(yes + " respondents believe that the news is true while " + no + " respondents believe that the news is a hoax.");

        //Solution 13
        Random rand = new Random();
        int n = rand.nextInt(10);
        //   int result = 1;

        //   for (int i = 1; i <= n; i++) {
        //     result = result * i;
        //   }
        //   System.out.println("The factorial of " + n + " is: " + result);

        int result = 1, i;
            
        for (i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("The factorial of " + n + " is: " + result);
        // //Solution 14
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Please enter an angle degree to convert into radians.");
        // double degree = scan.nextDouble();
        // System.out.println("You indicated " + degree + " degrees, which is " + Math.toRadians(degree) + " radians");

        // //Solution 15
        // Scanner scn = new Scanner(System.in);

        // System.out.println("Please enter a measurement in radians to convert into angle degrees.");
        // double radians = scn.nextDouble();
        // System.out.println("You have indicated " + radians + " radians, which converts to " + Math.toDegrees(radians) + " degrees.");

        // //Solution 16
        // Random rndm = new Random();
        // int ageUser1 = rndm.nextInt(50);
        // int ageUser2 = rndm.nextInt(50);

        // if (ageUser1 > ageUser2) {
        //     System.out.println("User 1 is older with an age of " + Math.max(ageUser1, ageUser2));
        // } else if (ageUser1 < ageUser2) {
        //     System.out.println("User 2 is older with an age of " + Math.max(ageUser1, ageUser2));
        // } else {
        //     System.out.println("Both User 1 and User 2 are the same age");
        // }
        


           
    }
}
