package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANGE = 100;
    private Random number = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(), number.nextInt(MAX_RANGE));
    }
}
