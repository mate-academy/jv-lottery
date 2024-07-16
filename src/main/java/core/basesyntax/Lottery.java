package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static final int MAX_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomNumber() {
        return random.nextInt(MAX_BOUND);
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }
}
