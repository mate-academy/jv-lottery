package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_NUMBER_COUNT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(RANDOM_NUMBER_COUNT));
        return ball;
    }
}
