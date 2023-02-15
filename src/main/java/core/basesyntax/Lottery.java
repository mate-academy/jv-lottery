package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    private static final int NUMBER_LIMIT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_LIMIT ));
    }
}
