package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUNDS = 100;

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random number = new Random();
        return new Ball(supplier.getRandomColor(), number.nextInt(NUMBER_BOUNDS));
    }
}
