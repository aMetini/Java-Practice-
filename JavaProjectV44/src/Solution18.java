import java.util.Arrays;

public class Solution18 {
    public static void main(String[] args) throws Exception {
        int[] numArray = {100, 2, 30, 60, 50, 44, 70, 80, 90, 10};
        Arrays.sort(numArray);

        int i = 0;
        int smallestNo = Integer.MAX_VALUE;

        do{
            if(smallestNo > numArray[i]) {
                smallestNo = numArray[i];

                System.out.println("The smallest element in our array is: " + smallestNo);
            }
            i++;
            //System.out.println("The smallest element in our array is: " + smallestNo);
        } while(i < numArray.length);
    }
    
}
