package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomNumber() {
        return random.nextInt(MAX_NUMBER);
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }
}
