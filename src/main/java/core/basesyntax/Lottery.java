package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.color = colorSupplier.getRandomColor();
        ball.number = random.nextInt(MAXIMUM_NUMBER);
        return ball;
    }
}
