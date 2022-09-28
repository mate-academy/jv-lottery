package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final int MAXIMUM_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), new Random().nextInt(MAXIMUM_NUMBER));
    }
}
