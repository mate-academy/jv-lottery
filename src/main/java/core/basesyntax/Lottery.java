package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomValueSupplier = new Random();
    private static final int MAX_VALUE = 101;

    public Ball getRandomBall() {
        int number = randomValueSupplier.nextInt(MAX_VALUE);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}

