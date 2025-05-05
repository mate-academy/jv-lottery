package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(101);
        return new Ball(supplier.getRandomColor(), number);
    }
}
