import java.util.Random;
import java.text.DecimalFormat;

public class Solution2d {
    public static void main(String[]args) throws Exception {
        double minValue = -24.0;
        double maxValue = 110.0;
        DecimalFormat df = new DecimalFormat("####0.00");
        //double randomTempF = new Random().nextDouble(minValue, maxValue);
        double randomTempF = new Random().nextDouble(minValue, maxValue);

        double tempC = (randomTempF - 32) * 5/9;

        System.out.println("Our randomly generated temperature in Farenheit is: " + df.format(randomTempF));
        System.out.println("The temperature in Celcius is: " + df.format(tempC));
    }
    
}
