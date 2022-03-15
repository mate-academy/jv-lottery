package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery(ColorSupplier supplier, Random random) {
        this.colorSupplier = supplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }
}
