package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_RANGE = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = supplier.getRandomColor();
        int number = random.nextInt(NUMBER_RANGE);
        return new Ball(color, number);
    }
}
