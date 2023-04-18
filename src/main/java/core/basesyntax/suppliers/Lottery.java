package core.basesyntax.suppliers;

import core.basesyntax.model.Ball;
import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), new Random().nextInt(100));
    }
}
