package core.basesyntax.constructors;

import java.security.SecureRandom;

public class Lottery {
    private static final int NUM_RANGE = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final SecureRandom randomizer = new SecureRandom();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), randomizer.nextInt(NUM_RANGE));
    }
}
