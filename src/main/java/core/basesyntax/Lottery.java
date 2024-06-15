package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(RANGE_BOUND);
        return new Ball(color, randomNumber);
    }
}
