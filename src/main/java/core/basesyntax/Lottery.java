package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int MAXIMUM_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(random.nextInt(MAXIMUM_NUMBER));
        return ball;
    }
}
