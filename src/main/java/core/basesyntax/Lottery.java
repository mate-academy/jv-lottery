package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int CONST_NUMBER = 100;
    private final int number = new Random().nextInt(CONST_NUMBER);
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), number);
    }
}
