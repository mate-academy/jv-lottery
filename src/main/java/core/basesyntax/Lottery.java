package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 100;
    private final Random number = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), number.nextInt(NUMBER_OF_BALLS));
    }
}
