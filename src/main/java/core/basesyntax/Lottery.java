package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}
