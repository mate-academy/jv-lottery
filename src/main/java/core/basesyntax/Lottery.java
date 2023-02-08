package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALLS = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_BALLS));
    }
}
