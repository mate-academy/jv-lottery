package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
