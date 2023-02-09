package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier randColor = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(randColor.getRandomColor());
        ball.setNumber(random.nextInt(MAX_RANDOM_VALUE));
        return ball;
    }
}
