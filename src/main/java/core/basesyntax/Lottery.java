package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAGIC_NUMBER = 3;
    private static final int MAX_VALUE = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_VALUE));
        return ball;
    }
}
