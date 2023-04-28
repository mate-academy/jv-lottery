package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNumbers = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomNumbers.nextInt(maxNumber));
    }
}
