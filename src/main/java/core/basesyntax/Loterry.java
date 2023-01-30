package core.basesyntax;

import java.util.Random;

public class Loterry {
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final Random random = new Random();
    public static final int UPPER_BOUND = 100;

    public Ball getRandomBall() {
        String color = String.valueOf(colorSupplier.getRandomColor());
        return new Ball(color, random.nextInt(UPPER_BOUND));
    }
}
