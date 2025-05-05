package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int limit = 100;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public final Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor().name());
        ball.setNumber(random.nextInt(limit));
        return ball;
    }
}
