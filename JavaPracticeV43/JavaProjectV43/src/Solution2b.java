import java.util.Random;
import java.text.DecimalFormat;;

public class Solution2b {
    public static void main(String[]args) throws Exception {
        double minLimit = 1.0;
        double maxLimit = 100000.0;
        DecimalFormat df = new DecimalFormat("####0.00");
        //double generatedBRL = minLimit + (double) (Math.random() * (maxLimit - minLimit));
        double generatedBRL = new Random().nextDouble(minLimit, maxLimit);
        // double generatedBRL = new Random().nextDouble();
        double convertToSEK = generatedBRL * 2.64;
        
        System.out.println("We randomly received a value of " + df.format(generatedBRL) + " Brazilian Real");
        System.out.println("The value of this amount in SEK is: " + df.format(convertToSEK));


    }
    
}
