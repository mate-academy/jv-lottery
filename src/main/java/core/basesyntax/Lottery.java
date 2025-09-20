package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 101;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
