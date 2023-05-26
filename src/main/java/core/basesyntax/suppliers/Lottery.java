package core.basesyntax.suppliers;

import core.basesyntax.model.Ball;
import java.util.Random;

public class Lottery {
    private final int maxNumber;
    private final ColorSupplier supplier;
    private final Random random = new Random();

    public Lottery(ColorSupplier supplier, int maxNumber) {
        this.supplier = supplier;
        this.maxNumber = maxNumber;
    }

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(maxNumber));
    }
}
