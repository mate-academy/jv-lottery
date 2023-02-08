package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final int BOUND_RANDOM = 100;
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(RANDOM.nextInt(BOUND_RANDOM), COLOR_SUPPLIER.getRandomColor());
    }
}
