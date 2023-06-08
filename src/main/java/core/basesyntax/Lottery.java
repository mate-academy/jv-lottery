package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int limit = 100;

    public Ball getRandomBall() {
        String newColor = colorSupplier.getRandomColor();
        int newNumber = random.nextInt(limit);

        return new Ball(newColor, newNumber);
    }
}
