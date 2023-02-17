package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public static final Ball getRandomBall() {
        final String color = String.valueOf(ColorSupplier.getRandomColor());
        final int index = new Random().nextInt(100);
        return new Ball(color, index);
    }
}
