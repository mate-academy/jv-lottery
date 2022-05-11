package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_COLOR_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomColor() {
        return new Ball(random.nextInt(MAX_COLOR_VALUE), supplier.getRandomColor());
    }
}
