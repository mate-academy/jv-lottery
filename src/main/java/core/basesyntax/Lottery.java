package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        return new Ball(randomNumber, colorSupplier.getRandomColor());
    }
}
