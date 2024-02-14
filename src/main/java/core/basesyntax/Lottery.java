package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAXIMUM_NUMBER_COUNT));
    }
}
