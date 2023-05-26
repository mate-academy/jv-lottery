package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = SingletonRandom.getInstance();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_BALL_NUMBER));
    }
}
