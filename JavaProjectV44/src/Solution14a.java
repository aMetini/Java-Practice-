public class Solution14a {
    public static void main(String[] args) throws Exception {
        int i = 0;
        //int oddSquare = 0;
        int sumOddSquared = 0;

        do{
            if (i % 2 != 0) {
                //oddSquare = (int) Math.pow(i, 2);
                //sumOddSquared += oddSquare;
                sumOddSquared += (i * i);
                //System.out.println(sumOddSquared);
                //System.out.println(oddSquare + " ");
                System.out.println("The sum of all odd numbers squared, between 0 - 10 is: " + sumOddSquared);
            }
                i++;
                
                
        }while (i <= 10);
    }
    
}