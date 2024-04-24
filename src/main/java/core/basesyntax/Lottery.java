package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static String color;

    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        final int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
