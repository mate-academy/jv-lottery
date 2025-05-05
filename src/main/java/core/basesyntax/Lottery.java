package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_NUMBER));
        return ball;
    }
}
