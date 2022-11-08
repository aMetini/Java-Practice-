import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[5];
        //boolean isAscending;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 5 numbers to create an array.");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0 || array[i] > 50) {
                System.out.println("Your entry is out of bounds. Please enter another number between 0 - 50.");
            }
        }
        System.out.println("The elements in your array are:");
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
            System.out.print(" ");
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println("The statement, this array is in ascending order is: " + isAscending(array));
        }

    public static boolean isAscending(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
    }
    return true;
}
}