package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int value = random.nextInt(MAX_VALUE);
        return new Ball(colorSupplier.getRandomColor(),value);
    }
}
