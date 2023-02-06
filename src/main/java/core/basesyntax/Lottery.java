package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int bound = 100;

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(bound);
        Colors randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
