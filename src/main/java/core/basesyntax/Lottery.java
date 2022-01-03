package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(COLOR_SUPPLIER.getRandomColor(), RANDOM.nextInt(100));
    }
}
