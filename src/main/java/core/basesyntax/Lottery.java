package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_RANGE_LIMIT = 100;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        return new Ball(COLOR_SUPPLIER.getRandomColor(), RANDOM.nextInt(RANDOM_RANGE_LIMIT));
    }
}
