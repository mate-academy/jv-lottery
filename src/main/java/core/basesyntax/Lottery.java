package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        final static int maxNumber = 100;
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(maxNumber + 1));
    }
}
