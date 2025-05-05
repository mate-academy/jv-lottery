package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random number = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private final int range = 100;

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), number.nextInt(range));
    }
}
