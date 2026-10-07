package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall(Random random) {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(random), random.nextInt(MAX_BALL_NUMBER));
    }
}
