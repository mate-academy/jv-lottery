package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int index = random.nextInt(BALL_COUNT);
        Ball ball = new Ball(supplier.getRandomColor(), index);
        return ball;
    }
}
