package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        Color color = COLOR_SUPPLIER.getRandomColor();
        int value = RANDOM.nextInt(MAX_VALUE);
        return new Ball(color.name(), value);
    }
}
