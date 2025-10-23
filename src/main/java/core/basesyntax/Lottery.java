package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxNumber = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors color = colorSupplier.getRandomColor();
        int number = (random.nextInt(maxNumber));
        return new Ball(color, number);
    }
}
