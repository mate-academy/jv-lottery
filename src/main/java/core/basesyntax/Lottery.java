package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_SEED = 100;
    private Random random = new Random(RANDOM_SEED);
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt());
    }
}
