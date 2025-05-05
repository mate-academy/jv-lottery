package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_VALUE = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_MAX_VALUE));
        return ball;
    }
}


