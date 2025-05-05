package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_RANGE = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = this.colorSupplier.getRandomColor();
        int number = this.random.nextInt(NUMBER_RANGE);
        return new Ball(color, number);
    }
}
