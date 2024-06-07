package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(new Random().nextInt(NUMBER));
        return randomBall;
    }
}
