package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final ColorSupplier RANDOM_COLOR = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_RANDOM_NUMBER));
        ball.setColor(RANDOM_COLOR.getRandomColor());
        return ball;
    }
}
