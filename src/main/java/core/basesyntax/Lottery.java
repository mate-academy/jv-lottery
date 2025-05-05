package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_VALUE = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball(random.nextInt(RANDOM_VALUE), colorSupplier.getRandomColor());
        return ball;
    }
}
