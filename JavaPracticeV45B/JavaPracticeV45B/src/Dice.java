import java.util.Random;

public class Dice {
    private int value;

    // public Dice(int rollVal) {
    //     value = rollVal;
    // }

    public int getRollVal() {
        return value;
    }

    public void setRollVal(int rollVal) {
        value = rollVal;
    }

    public int throwDice() {
        Random rnd = new Random();

        value = rnd.nextInt(1, 7);
        return value;
    }
}
