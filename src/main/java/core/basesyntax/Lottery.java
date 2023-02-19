package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public static final Ball getRandomBall() {
        final String color = String.valueOf(ColorSupplier.getRandomColor());
        final int index = new Random().nextInt(MAX_NUMBER);
        return new Ball(color, index);
    }
}
