package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int NUMBER_LIMIT = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_LIMIT));
    }
}
