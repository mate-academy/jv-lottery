package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;
    private ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Lottery() {
        this.random = new Random();
        this.supplier = new ColorSupplier();
    }

    Ball getRandomBall() {
        int randomNumber = random.nextInt(101);
        return new Ball(supplier.getRandomColor(), randomNumber);
    }
}
