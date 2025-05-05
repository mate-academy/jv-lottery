package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier color = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(MAX_BALL_NUMBER));
    }
}
