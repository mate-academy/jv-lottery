package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_OF_RANDOM_NUMBERS = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(RANGE_OF_RANDOM_NUMBERS));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
