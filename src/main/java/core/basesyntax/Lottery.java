package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final Ball ball = new Ball();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_VALUE));
        return ball;
    }
}
