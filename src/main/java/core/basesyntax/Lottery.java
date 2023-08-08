package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int number = new Random().nextInt(MAX_NUMBER) + 1;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
