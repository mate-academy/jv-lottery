package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }
}
