package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int upperLimit = 101;

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(upperLimit));
        return ball;
    }
}
