package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    final int constant = 100;

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(constant));
    }
}