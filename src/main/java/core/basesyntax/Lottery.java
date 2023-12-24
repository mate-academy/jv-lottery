package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int NUMBER_LIMIT = 101;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(NUMBER_LIMIT));
        return ball;
    }
}
