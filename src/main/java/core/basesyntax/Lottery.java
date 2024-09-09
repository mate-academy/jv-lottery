package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();

        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_NUMBER));

        return ball;
    }
}
