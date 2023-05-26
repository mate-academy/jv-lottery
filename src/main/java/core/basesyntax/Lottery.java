package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int LOT_CONST = 100;

    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(),random.nextInt(LOT_CONST));
    }
}
