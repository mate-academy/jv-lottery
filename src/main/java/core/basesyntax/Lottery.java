package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random number = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int range = 100;
        return new Ball(color.getRandomColor(), number.nextInt(range));
    }
}
