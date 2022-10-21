package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();
    private final int BOUND_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(BOUND_NUMBER));
    }
}
