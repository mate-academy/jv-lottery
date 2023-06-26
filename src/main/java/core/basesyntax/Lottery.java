package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();
    private static final int RANDOM_COUNT = 100;

    public static Ball getRandomBall() {
        return new Ball(COLOR_SUPPLIER.getRandomColor(), RANDOM.nextInt(RANDOM_COUNT));
    }
}
