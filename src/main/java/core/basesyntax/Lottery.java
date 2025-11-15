package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int lowerBound = 1;
        int upperBound = 101;
        int randomNumber = random.nextInt(lowerBound, upperBound);
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
