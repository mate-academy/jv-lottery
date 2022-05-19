package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public int randomNumber() {
        return random.nextInt(MAX_VALUE);
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomNumber());
    }
}
