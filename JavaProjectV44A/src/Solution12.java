public class Solution12 {
    public static void main(String[] args) throws Exception {
        int i;
        int range = 50;
        int evenSum = 0;

        for (i = 2; i <= range; i += 2) {
            evenSum += i;
        }

        // for (i = 0; i <= range; i++) {
        //     if (i % 2 == 0) {
        //         evenSum += i;
        //     }
        // }
        System.out.println("The sum of all even numbers between 0 - 50 is: " + evenSum);
    }
    
}
