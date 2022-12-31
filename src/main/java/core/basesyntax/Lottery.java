package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random getRandom = new Random();

    public static Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setBallColor(ColorSupplier.getRandomColor());
        randomBall.setBallNumber(getRandom.nextInt(100));
        return randomBall;
    }
}
