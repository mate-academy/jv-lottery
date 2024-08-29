package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_VALUE = 100;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(COLOR_SUPPLIER.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
    }
}
