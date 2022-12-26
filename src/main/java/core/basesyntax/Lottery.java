package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int max_number = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(max_number);
        String color = colorSupplier.getRandomColor().name();
        return new Ball(number, color);
    }
}

