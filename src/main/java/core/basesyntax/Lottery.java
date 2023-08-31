package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(maxNumber));
        return ball;
    }
}
