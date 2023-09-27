package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 101;
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(supplier.getRandomColor(), random.nextInt(NUMBER_BOUND));
    }
}
