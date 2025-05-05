package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final int RANDOMIZER_BOUND = 100;
    private final SecureRandom randomizer = new SecureRandom();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomizer.nextInt(RANDOMIZER_BOUND));
    }
}
