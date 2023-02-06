package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final int boundRandom = 100;
    private final int randomNumber = new SecureRandom().nextInt(boundRandom);
    private final String randomColor = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        return new Ball(randomNumber, randomColor);
    }
}
