import java.util.Random;

public class Dice {

    private final Random random;

    Dice(Random r){
        this.random = r;
    }

    public int getRandom() {
        return random.nextInt(1, 6);
    }
}
