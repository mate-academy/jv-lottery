package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setNumber(random.nextInt(BALL_COUNT));
        randomBall.setColor(new ColorSupplier().getRandomColor());
        return randomBall;
    }
}
