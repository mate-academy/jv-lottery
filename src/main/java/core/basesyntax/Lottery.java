package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int MAXIMUM_NUMBER = 100;
    private static final int MINIMUM_NUMBER = 1;

    public static Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        int number = random.nextInt(MAXIMUM_NUMBER) + MINIMUM_NUMBER;
        return new Ball(color, number);
    }
}
