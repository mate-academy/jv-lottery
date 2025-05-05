package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM));
        return ball;
    }
}
