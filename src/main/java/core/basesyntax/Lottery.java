package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int bound = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(bound);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
