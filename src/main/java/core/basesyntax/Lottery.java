package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static void getRandomBall() {
        final int value = random.nextInt(100);
        System.out.println(colorSupplier.getRandomColor() + " " + value);
    }
}
