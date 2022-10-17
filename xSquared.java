import java.util.Scanner;

public class Square2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;

        System.out.println("Let's draw a box. Please enter the height of your box.");
        int xHeight = input.nextInt();

        System.out.println("Please enter the width of your box.");
        int yWidth = input.nextInt();
        //drawbox(xHeight, yWidth);

        for (i = 1; i <= xHeight; i++) {
            for (j = 1; j <= yWidth; j++) {
                if (i == 1 || i == xHeight || j == 1 || j == yWidth)
                    System.out.print("X");
                else 
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}