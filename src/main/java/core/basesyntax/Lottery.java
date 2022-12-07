package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;
    private final Ball ball = new Ball();
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        ball.setNumber(random.nextInt(NUMBER_COUNT));
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
