public class Solution17 {
    public static void main(String[] args) throws Exception {
        int[] numArray = {100, 20, 30, 40, 50, 60, 70, 80, 90, 10};

        int largestNo = Integer.MIN_VALUE;
        int i = 0;

        while(i < numArray.length) {
            if(largestNo < numArray[i]){
                largestNo = numArray[i];
            }
            i++;
        }
        System.out.println("The largest number in our array is: " + largestNo);
    }
    
}
