package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        int number = random.nextInt(BOUND);
        String color = colorSupplier.getRandomColor();

        return new Ball(color, number);
    }
}
