package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name().toLowerCase();
        int number = random.nextInt(NUMBER);
        return new Ball(color, number);
    }
}
