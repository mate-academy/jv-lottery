package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxNumber = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(maxNumber + 1);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
