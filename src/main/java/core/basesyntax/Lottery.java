package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_LIMIT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(RANDOM_LIMIT));
    }
}
