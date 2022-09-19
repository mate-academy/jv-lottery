package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final Random rand = new Random();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(),rand.nextInt(100));
    }
}
