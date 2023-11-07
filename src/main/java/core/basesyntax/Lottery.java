package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALLS_QUANTITY = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(BALLS_QUANTITY);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
