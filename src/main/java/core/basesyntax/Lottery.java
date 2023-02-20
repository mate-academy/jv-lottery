package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        final String color = colorSupplier.getRandomColor();
        final int index = random.nextInt(MAX_NUMBER);
        return new Ball(color, index);
    }
}
