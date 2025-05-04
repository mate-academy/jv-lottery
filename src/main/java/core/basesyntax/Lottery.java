package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_COUNT));
    }
}
