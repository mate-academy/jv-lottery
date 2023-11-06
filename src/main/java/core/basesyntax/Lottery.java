package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        final int MAGIC_NUMBER = 101;
        int number = random.nextInt(MAGIC_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
