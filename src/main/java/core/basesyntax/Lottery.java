package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier supplier;
    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;

    public static int getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        return new Ball(ColorSupplier.getRandomColor(), value);
    }
}

