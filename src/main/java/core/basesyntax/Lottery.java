package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(LIMIT);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
