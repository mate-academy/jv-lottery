package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int HUNDRED = 100;
    private final Random random = new Random();

    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = supplier.getRandomColor();
        int number = random.nextInt(HUNDRED);
        return new Ball(color, number);
    }
}
