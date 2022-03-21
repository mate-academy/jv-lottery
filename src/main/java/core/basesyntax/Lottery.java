package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND_OF_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(new ColorSupplier().getRandomColor());
        randomBall.setNumber(new Random().nextInt(BOUND_OF_RANDOM_NUMBER));
        return randomBall;
    }
}
