package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random number = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), number.nextInt(MAX_BALL_NUMBER));
    }
}
