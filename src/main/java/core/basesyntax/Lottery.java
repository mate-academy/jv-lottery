package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_SUPPLIER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ball.setNumber(random.nextInt(BALL_SUPPLIER));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
