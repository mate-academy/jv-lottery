package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_RANDOM_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        int number = random.nextInt(MAX_RANDOM_NUMBER);
        ball.setNumber(number);
        return ball;
    }
}
