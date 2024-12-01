package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = getColorSupplier().getRandomColor();
        int number = getRandom().nextInt(100);
        return new Ball(color.toString(), number);
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Random getRandom() {
        return random;
    }
}
