package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private final ColorSupplier color = new ColorSupplier();
    private final Random number = new Random();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), number.nextInt(BOUND));
    }
}
