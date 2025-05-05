package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final int BOUND_RANDOM = 100;
    private final SecureRandom random = new SecureRandom();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(BOUND_RANDOM), colorSupplier.getRandomColor());
    }
}
