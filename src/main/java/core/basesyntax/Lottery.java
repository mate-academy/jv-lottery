package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomValueSupplier = new Random();
    private final int maxValue = 101;

    public Ball getRandomBall() {
        int number = randomValueSupplier.nextInt(maxValue);
        return new Ball(colorSupplier.getRandomColor(), number);

    }
}

