import java.util.Random;

public class Solution2c {
    public static void main(String[]args) throws Exception {
        int minValue = 1;
        int maxValue = 12;
        int randomA = new Random().nextInt(minValue, maxValue);
        int randomB = new Random().nextInt(minValue, maxValue);

        System.out.println(randomA + randomB);
	    System.out.println(randomA - randomB);
	    System.out.println(randomA * randomB);
	    System.out.println(randomA / randomB);
	    System.out.println(randomA % randomB);

    }
    
}
