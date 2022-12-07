package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private Ball ball = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setNumber(random.nextInt(MAX_NUMBER));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
