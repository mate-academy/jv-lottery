package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setNumber(random.nextInt(MAX_BALL_NUMBER));
        randomBall.setColor(colorSupplier.getRandomColor());
        return randomBall;
    }
}
