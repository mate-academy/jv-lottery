package core.lottery;

import core.balls.Ball;
import core.colors.ColorSupplier;
import java.util.Random;

public class Lottery {
    final private int MAGIC_NUMBER = 100;
    private ColorSupplier colorSupplier;
        
    public Lottery() {
        colorSupplier = new ColorSupplier();
    }
     
    public Ball getRandomBall() {
        return new Ball(generateNumber() + 1, colorSupplier.getRandomColor());
    }
        
    private int generateNumber() {
        Random random = new Random();
        return random.nextInt(MAGIC_NUMBER);
    }
}
