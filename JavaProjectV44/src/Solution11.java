public class Solution11 {
    public static void main(String[] args) throws Exception {
        // int num = 1, sum = 0, average = 0;

        // while(num <= 20) {
            
        //     sum += num;
        //     num++;

        //     average = sum / 20;
            
        // }

        int range = 20, i = 1, sum = 0, average = 0;

        while(i <= range) {
            sum += i;
            i++;

            average = sum / range;
        }
        System.out.println("The total sum of all natural numbers from 1 - 20 is: " + sum);
        System.out.println("The average of the sum of all natural numbers from 1 - 20 is: " + average);
    }
    
}
