import java.util.Random;

public class MyOwnRandomSignature {
    public int getRandomBetweenNumbers(int minValue, int maxValue) {
        Random rnd = new Random();

        return rnd.ints(minValue, maxValue)
            .findFirst()
            .getAsInt();

        //return rnd.nextInt(maxValue - minValue) + minValue;
    }
    
}
