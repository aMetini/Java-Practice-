public class Solution7 {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 20; i++) {
            // if (i % 2 == 0) {
            //     System.out.println("Number = " + i + ". This is an even number.");
            // } else {
            //     System.out.println("Number = " + i + ". This is an odd number");
            // }
            String result = (i % 2 == 0) ? 
            "Number = " + i + ". This is an even number." : "Number = " + i + ". This is an odd number";

            System.out.println(result);
        }
    }
    
}
