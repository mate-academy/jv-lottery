package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new SecureRandom().nextInt(100));
    }
}
