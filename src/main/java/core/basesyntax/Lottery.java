package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }
}
