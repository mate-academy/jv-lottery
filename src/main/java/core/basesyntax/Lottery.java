package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public ColorSupplier getRandomColor() {
        return randomColor;
    }

    public int getRandomNumber() {
        return random.nextInt(NUMBER_MAX_VALUE);
    }

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(), getRandomNumber());
    }
}
