package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(BOUND);
        Colors randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
