package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE_BALL = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE_BALL));
    }
}
