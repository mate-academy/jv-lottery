package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_TOP_BOUND = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(RANDOM_TOP_BOUND), colorSupplier.getRandomColor());
    }
}
