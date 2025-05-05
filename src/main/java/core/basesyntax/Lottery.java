package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random randomGenerator = new Random();

    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(randomGenerator.nextInt(MAX_NUMBER));
        return ball;
    }
}
