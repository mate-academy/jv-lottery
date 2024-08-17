package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxRandomNumber = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(maxRandomNumber);
        Colors color = colorSupplier.getRandomColor();

        return new Ball(color, randomNumber);
    }
}
