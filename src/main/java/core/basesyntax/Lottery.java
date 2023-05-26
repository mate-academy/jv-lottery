package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = supplier.getRandomColor();
        int number = random.nextInt(VALUE);
        return new Ball(color, number);
    }
}

