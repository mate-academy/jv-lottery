package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final int BOUND_RANDOM = 100;
    private final SecureRandom randomNumber = new SecureRandom();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomNumber.nextInt(BOUND_RANDOM), randomColor.getRandomColor());
    }
}
