import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the number of integer elements that you would like to store in your array.");
        // User indicates the size of the array
        arraySize = scanner.nextInt();
        
        int[] array = new int[arraySize];
        System.out.println("Please enter the elements in your integer array.");

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The elements in your array are:");
        for (int i = 0; i < arraySize; i++) {
            //System.out.println(array[i]);
            System.out.println(" ");
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < arraySize; i++) { 
            if (array[i] == 0) {
                array[i] = array[(i + 1) % arraySize];
            }
        }
        System.out.println("The elements in your array without 0s, replaced with the next element are: ");
        for (int i = 0; i < arraySize; i++) {
            //System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(Arrays.toString(array));
    }
}
