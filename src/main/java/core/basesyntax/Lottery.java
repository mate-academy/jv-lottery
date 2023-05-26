package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private int getRandomNumber() {
        return random.nextInt(NUMBER_MAX_VALUE);
    }
}
