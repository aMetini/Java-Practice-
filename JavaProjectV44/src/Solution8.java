public class Solution8 {
    public static void main(String[] args) throws Exception {
        int counter = 1;
        
        while (counter <= 20) {
            String result = (counter % 2 == 0) ? 
            "Counter = " + counter + ". This is an even number." : "Counter = " + counter + ". This is an odd number.";

            System.out.println(result);
            counter ++;
        }
    }
}
