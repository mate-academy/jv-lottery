package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int HUNDRED = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(HUNDRED));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
