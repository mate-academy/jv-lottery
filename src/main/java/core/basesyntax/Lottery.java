package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_BALL_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_BALL_NUMBER));
        return ball;
    }
}
