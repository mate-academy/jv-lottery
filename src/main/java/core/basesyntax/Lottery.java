package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER;
    private static final Random RANDOM;

    static {
        COLOR_SUPPLIER = new ColorSupplier();
        RANDOM = new Random();
    }

    public Ball getRandomBall() {
        int number = RANDOM.nextInt(100);
        String color = COLOR_SUPPLIER.getRandomColor();
        return new Ball(color, number);
    }
}
