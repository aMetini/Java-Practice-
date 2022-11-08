import java.util.Arrays;
import java.util.Collections;

public class Solution2A {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int i = 0;

        Arrays.sort(intArray, Collections.reverseOrder());

        for (i = 0; i < intArray.length; i++) {
           System.out.println(" ");
        }
        System.out.println(Arrays.toString(intArray));

        while(i < intArray.length) {
            System.out.println(" ");
            i++;
        }
        System.out.println(Arrays.toString(intArray));

        do{
            System.out.println(" ");
            i++;
        }while (i < intArray.length);
        System.out.println(Arrays.toString(intArray));
    }
}