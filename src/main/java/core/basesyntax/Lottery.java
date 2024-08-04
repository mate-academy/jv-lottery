package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier SUPPLIER = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int number = RANDOM.nextInt(MAX_NUMBER);
        Color color = SUPPLIER.getRandomColor();
        return new Ball(color, number);
    }
}
