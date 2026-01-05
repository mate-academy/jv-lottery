package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 101;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
