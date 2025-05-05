package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    private static final SecureRandom NUMBER = new SecureRandom();
    
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(COLOR_SUPPLIER.getRandomColor(), NUMBER.nextInt(MAX_BALL_NUMBER));
    }
}
