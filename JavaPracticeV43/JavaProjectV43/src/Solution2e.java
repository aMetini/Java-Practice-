import java.text.DecimalFormat;
import java.util.Random;

public class Solution2e {
    public static void main(String[]args) throws Exception {
        double minVal = 0.0;
        double maxVal = 100000.00;
        DecimalFormat df = new DecimalFormat("####0.00");
        double randomPrice = new Random().nextDouble(minVal, maxVal);

        double discount = randomPrice * 0.13;
        double totalPrice = randomPrice - discount;

        System.out.println("The price of your item is $" + df.format(randomPrice) + " USD. You will receive a discount of: $" + df.format(discount));
        System.out.println("Your total price will now be: $" + df.format(totalPrice) + " USD!");
    }
    
}
