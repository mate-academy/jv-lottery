package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 101;
    private final Ball ball = new Ball();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(MAX_RANDOM_NUMBER));
        return ball;
    }
}
