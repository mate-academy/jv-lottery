package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int RANGE_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(COLOR_SUPPLIER.getRandomColor(),RANDOM.nextInt(RANGE_NUMBER));
    }
}
