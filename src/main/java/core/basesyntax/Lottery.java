package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_VALUE);

        return new Ball(color, number);
    }
}
