package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALLS_QUANTITY_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(BALLS_QUANTITY_BOUND));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
