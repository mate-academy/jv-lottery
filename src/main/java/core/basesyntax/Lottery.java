package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BOUND_NUMBER));
    }
}
