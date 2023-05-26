package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_COUNT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_COUNT);
        return new Ball(color, number);
    }
}
