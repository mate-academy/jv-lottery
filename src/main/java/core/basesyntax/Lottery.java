package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomValueSupplier = new Random();

    public Ball getRandomBall() {
        int number = randomValueSupplier.nextInt(MAX_VALUE);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}

