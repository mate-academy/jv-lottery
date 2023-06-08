package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int LIMIT = 100;

        String newColor = colorSupplier.getRandomColor();
        int newNumber = random.nextInt(LIMIT);

        return new Ball(newColor, newNumber);
    }
}
