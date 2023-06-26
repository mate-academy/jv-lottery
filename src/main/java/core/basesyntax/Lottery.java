package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(RANDOM.nextInt(MAX_NUMBER));
        return ball;
    }
}
