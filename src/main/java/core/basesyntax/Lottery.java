package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE = 100;
    private Ball ball = new Ball();

    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(RANGE + 1));
        return ball;
    }
}
