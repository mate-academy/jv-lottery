package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier;

    private final Random random;

    public Lottery() {
        this.random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
