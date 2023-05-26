package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int CONSTANT_NUMBER = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = String.valueOf(colorSupplier.getRandomColor());
        int index = random.nextInt(CONSTANT_NUMBER);
        return new Ball(color, index);
    }
}
