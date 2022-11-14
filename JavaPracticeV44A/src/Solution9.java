public class Solution9 {
    public static void main(String[] args) throws Exception {
        int counter = 1;

        do{
            String result = (counter % 2 == 0) ? 
            "Counter is " + counter + ", which is an even number." : "Counter is " + counter + ", which is an odd number";

            System.out.println(result);
            counter ++;

        }while (counter <= 20);
    }
    
}
