package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(BOUND);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
