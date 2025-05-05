package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 101;
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private final Random RANDOM = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(COLOR_SUPPLIER.getRandomColor());
        ball.setNumber(RANDOM.nextInt(NUMBER_OF_BALLS));
        return ball;
    }
}
