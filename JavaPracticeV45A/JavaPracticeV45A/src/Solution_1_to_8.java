import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Solution_1_to_8 {
    public static void main(String[] args) throws Exception {
        //Solution 1
        String nameIn = "";
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter your name.");
            nameIn = sc.nextLine();
        }catch(InputMismatchException exception) {
            System.out.println("You have made an invalid entry.");
        }
        System.out.println("The length of your name is: " + nameIn.length() + " characters long.");

        // //Solution 2
        // String st1 = "Carpe Diem!";
        // String st2 = "Carpe Diem!";
        // String st3 = "Carpe diem!";

        // System.out.println(st1.equals(st2));
        // System.out.println(st1 == st2);
        // System.out.println(st1.equals(st3));
        // System.out.println(st1 == st3);

        // // Solution 3
        // String str1 = "Carpe Diem!";
        // String str2 = "Carpe Diem!";
        // String str3 = "Carpe diem!";

        // System.out.println(str1.equalsIgnoreCase(str2));
        // System.out.println(str1.equalsIgnoreCase(str3));

        // //Solution 4
        // String name1 = "Rafael";
        // String name2 = "Amber";

        // System.out.println(name1.endsWith("fael"));
        // System.out.println(name2.endsWith("fael"));

        // //Solution 5
        // String n1 = "Rafael";
        // String n2 = "Amber";

        // System.out.println(n1.startsWith("Rafa"));
        // System.out.println(n2.startsWith("Rafa"));

        // //Solution 6
        // Random random = new Random();
        // int counter = 0;
        // do {
        //     System.out.println(random.nextInt(11));
        //     counter++;
        // }
        // while(counter <= 10 );

        // //Solution 7
        // int range = 10;
        // int sum = 0;
        // int average = 0;
        // Random randNo = new Random();

        // for (int i = 0; i <= range; i++) {
        //     int val = randNo.nextInt( 11);
        //     System.out.println(val);
        //     sum += val;
        //     average = sum / range;
        // }
        // System.out.println("The total sum of all generated numbers is: " + sum);
        // System.out.println("The average of all generated numbers is: " + average);

        // //Solution 8
        // double no1 = 10.0;
        // double divided = no1 / 0.84;
        // double divRound = Math.round(divided);

        // System.out.println(divided);
        // System.out.println(divRound);

    }
}