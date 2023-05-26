package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final String RANDOM_COLOR = new ColorSupplier().getRandomColor();
    private static final int RANDOM_NUMBER = new SecureRandom().nextInt(100);

    public Ball getRandomBall() {
        return new Ball(RANDOM_COLOR, RANDOM_NUMBER);
    }
}
