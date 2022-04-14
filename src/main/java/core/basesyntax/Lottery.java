package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_RANDOM_NUMBER));
        ball.setColor(String.valueOf(supplier.getRandomColor()));
        return ball;
    }
}
