package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int value = new Random().nextInt(maxValue);
        return new Ball(color.getRandomColor(), value);
    }
}
