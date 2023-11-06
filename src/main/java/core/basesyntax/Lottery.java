package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        final int magicNumber = 101;
        int number = random.nextInt(magicNumber);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
