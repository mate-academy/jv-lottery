package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_MAX_NUMBER));
    }
}
