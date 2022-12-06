package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_RANGE = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random ballNumber = new Random();

    public String getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(ballNumber.nextInt(BALL_RANGE));
        ball.setColor(supplier.getRandomColor());
        return ball.toString();
    }
}
