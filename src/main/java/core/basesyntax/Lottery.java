package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setNumber(random.nextInt(BOUND));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
