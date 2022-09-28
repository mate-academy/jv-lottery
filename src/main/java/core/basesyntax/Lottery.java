package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int LIMIT = 100;
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), new Random().nextInt(LIMIT));
    }
}
