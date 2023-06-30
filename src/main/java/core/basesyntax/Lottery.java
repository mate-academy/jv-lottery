package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, random.nextInt(BALL_MAX_BOUND));
    }
}
