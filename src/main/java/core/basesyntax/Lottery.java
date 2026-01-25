package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int INDEX_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(INDEX_BOUND));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}

