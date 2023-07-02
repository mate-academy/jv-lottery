package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    protected Ball getRandomBall() {
        int index = random.nextInt(NUMBER_OF_BALLS);
        return new Ball(colorSupplier.getRandomColor(), index);
    }
}
