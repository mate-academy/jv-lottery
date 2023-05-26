package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    protected Ball getRandomBall() {
        int index = random.nextInt(MAX_NUMBER);
        String color = supplier.getRandomColor().toString();
        return new Ball(color, index);
    }
}
