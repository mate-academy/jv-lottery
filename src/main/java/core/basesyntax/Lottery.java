package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_MAX_RANGE = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        int number = random.nextInt(RANDOM_MAX_RANGE);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
