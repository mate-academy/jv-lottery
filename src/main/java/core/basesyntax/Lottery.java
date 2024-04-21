package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public ColorSupplier getCs() {
        return colorSupplier;
    }

    public Random getRandom() {
        return random;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(101));
        /*
        Creating new Ball with random color and
        generating random number for that ball from 0 to 100 inclusively
        * */
        return ball;
    }
}
