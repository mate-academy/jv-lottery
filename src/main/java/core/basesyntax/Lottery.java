package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int value = random.nextInt(MAX_RANDOM_NUMBER);
        return new Ball(color.name(), value);
    }
}
