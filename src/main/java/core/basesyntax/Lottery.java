package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int index = random.nextInt(LIMIT);
        return new Ball(colorSupplier.getRandomColor(), index);
    }
}
