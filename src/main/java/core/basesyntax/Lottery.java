package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(new ColorSupplier().getRandomColor());
        randomBall.setNumber(new Random().nextInt(BALL_COUNT));
        return randomBall;
    }
}
