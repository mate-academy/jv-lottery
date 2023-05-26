package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setNumber(random.nextInt(BALL_COUNT));
        randomBall.setColor(colorSupplier.getRandomColor());
        return randomBall;
    }
}
