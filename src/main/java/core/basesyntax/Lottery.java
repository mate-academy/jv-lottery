package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int UPPER_LIMIT = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(UPPER_LIMIT));
        return ball;
    }
}
