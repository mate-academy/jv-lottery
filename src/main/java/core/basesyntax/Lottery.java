package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier supplier = new ColorSupplier();

    private static final int maxNumber = 100;

    public Ball getRandomBall() {
        int number = new Random().nextInt(maxNumber);
        return new Ball(supplier.getRandomColor(), number);
    }
}
