package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier color;
    private final Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.color = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(MAX_NUMBER) + 1);
    }
}
