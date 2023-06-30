package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int bound = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = new Random().nextInt(bound);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
