package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(LIMIT));
    }
}
