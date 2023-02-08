package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(100));
    }
}
