package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 102;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_VALUE));
        return ball;
    }
}
