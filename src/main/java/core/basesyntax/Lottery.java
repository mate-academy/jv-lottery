package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier color;
    private final Random random;
    private static final int BOUND = 100;

    public Lottery() {
        this.color = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        int value = random.nextInt(BOUND);
        return new Ball(color.getRandomColor(), value);
    }
}