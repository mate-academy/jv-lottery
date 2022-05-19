package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int maxValue = 100;
    private final Random number = new Random();
    private final ColorSupplier colour = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colour.getRandomColor(), number.nextInt(maxValue));
    }

}
