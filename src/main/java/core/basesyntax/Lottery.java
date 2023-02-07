package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private final int randomNumber = new SecureRandom().nextInt(100);

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), randomNumber);
    }
}
