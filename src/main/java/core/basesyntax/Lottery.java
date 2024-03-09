package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 101;
    private Random random;
    private ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.supplier = supplier;
        this.random = random;
    }

    public Lottery() {
        this.random = new Random();
        this.supplier = new ColorSupplier();
    }

    Ball getRandomBall() {
        int randomNumber = random.nextInt(NUMBER_COUNT);
        return new Ball(supplier.getRandomColor(), randomNumber);
    }
}
