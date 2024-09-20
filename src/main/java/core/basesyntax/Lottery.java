package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = RANDOM.nextInt(MAX_VALUE);
        return new Ball(color, number);
    }
}
