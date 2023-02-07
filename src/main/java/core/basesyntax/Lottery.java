package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final int RANDOMIZERBOUND = 100;
    private final SecureRandom randomizer = new SecureRandom();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomizer.nextInt(RANDOMIZERBOUND));
    }
}
