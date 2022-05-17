package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;
    private final Random random;
    private final ColorSupplier color;

    public Lottery(Random random, ColorSupplier color) {
        this.random = random;
        this.color = color;
    }

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(NUMBER));
    }
}
