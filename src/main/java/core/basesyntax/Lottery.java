package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor().name();
        return new Ball(color, number);
    }
}
