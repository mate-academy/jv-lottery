package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxRandomBalls = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(maxRandomBalls));
        return ball;
    }
}
