public class Solution14b {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int sumOfOddSquared = 0;

        while(i <= 10) {
            if(i % 2 != 0) {
                int oddNumbers = (int) Math.pow(i, 2);
                sumOfOddSquared += oddNumbers;
            }
            i++;
        }
        System.out.println("The sum of all odd numbers squared, between 0 - 10 is: " + sumOfOddSquared);
    }
    
}
