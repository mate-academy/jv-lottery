package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_COUNT = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_COUNT));
        return ball;
    }
}
