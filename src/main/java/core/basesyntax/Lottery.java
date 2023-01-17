package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(MAX_BALL_NUMBER);
        Ball ball = new Ball(colorSupplier.getRandomColor(), ballNumber);
        return ball;
    }
}
