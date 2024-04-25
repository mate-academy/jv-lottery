package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        final int number = random.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
