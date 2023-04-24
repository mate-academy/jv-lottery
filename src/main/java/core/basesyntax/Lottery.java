package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = String.valueOf(colorSupplier.getRandomColor());
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
