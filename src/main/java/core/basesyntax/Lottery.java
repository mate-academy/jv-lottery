package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        int value = random.nextInt(100);
        return new Ball(supplier.getRandomColor().toString(), value);
    }
}
