package core.basesyntax;

import java.util.Random;


public class Lottery {
    private final Random RANDOM = new Random();
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Ball getRandomBall() {
        final int MAGIC_NUMBER = 101;
        int number = RANDOM.nextInt(MAGIC_NUMBER);
        return new Ball(COLOR_SUPPLIER.getRandomColor(), number);
    }
}
