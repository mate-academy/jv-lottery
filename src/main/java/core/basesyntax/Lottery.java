package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        String color = getColorSupplier().getRandomColor();
        Long number = getRandom().nextLong(100);
        return new Ball(color, number).toString();
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Random getRandom() {
        return random;
    }
}
