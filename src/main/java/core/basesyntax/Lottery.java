package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int NUM_BOUND = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUM_BOUND));
    }
}
