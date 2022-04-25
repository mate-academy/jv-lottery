package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier supplier = new ColorSupplier();
    private static Random random = new Random();
    private final int maxBound = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(maxBound));
        return ball;
    }
}
