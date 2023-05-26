package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_LIMIT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball anyBall = new Ball();
        anyBall.setColor(colorSupplier.getRandomColor().name());
        anyBall.setNumber(random.nextInt(BALL_LIMIT));
        return anyBall;
    }
}
