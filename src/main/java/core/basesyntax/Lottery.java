package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();
    private static final int BALL_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(COLOR_SUPPLIER.getRandomColor());
        ball.setNumber(RANDOM.nextInt(BALL_NUMBER));
        return ball;
    }
}

