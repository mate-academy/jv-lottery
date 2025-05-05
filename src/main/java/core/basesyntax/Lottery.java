package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Integer RANDOM_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(RANDOM_BOUND);
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(number);
        return ball;
    }
}
