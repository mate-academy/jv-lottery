package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public Ball getRandomBall() {
        int value = random.nextInt(MAX_BALL_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}
