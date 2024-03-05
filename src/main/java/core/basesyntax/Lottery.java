package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_LIMIT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(NUMBER_LIMIT + 1), colorSupplier.getRandomColor());
    }
}
