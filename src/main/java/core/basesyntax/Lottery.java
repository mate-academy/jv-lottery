package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int BALL_NUM = 100;
    private final int value = new Random().nextInt(BALL_NUM);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setNumber(value);
        randomBall.setColor(colorSupplier.getRandomColor());
        return randomBall;
    }
}
