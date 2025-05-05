package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(BOUND_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}

