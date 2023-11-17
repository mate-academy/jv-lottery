package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random(100);

    public Ball getRandomBall() {
        Ball randBall = new Ball();
        randBall.setColor(supplier.getRandomColor());
        randBall.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return randBall;
    }
}
