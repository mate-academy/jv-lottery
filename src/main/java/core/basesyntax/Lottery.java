package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private static final int MAX_RANDOM_NUMBER = 100;

    public Lottery() {
        this.random = new Random();
    }
    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
