package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int VALUE_SCALE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(VALUE_SCALE) + 1;
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
