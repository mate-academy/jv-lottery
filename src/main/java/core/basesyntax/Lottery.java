package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        int index = random.nextInt(MAX_VALUE);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(index, colorSupplier.getRandomColor());
    }
}
