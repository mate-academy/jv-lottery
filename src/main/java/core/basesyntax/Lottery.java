package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int QUANTITY_LIMIT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Ball ball = new Ball();
    private final Random random = new Random();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(QUANTITY_LIMIT));

        return ball;
    }
}
