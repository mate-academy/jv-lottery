package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier ColorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), random.nextInt(NUMBER_BOUND));
    }
}