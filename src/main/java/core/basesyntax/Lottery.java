package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBERS_OF_BALl = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_NUMBERS_OF_BALl) + 1;
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
