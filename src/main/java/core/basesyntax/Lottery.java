package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = RANDOM.nextInt(MAX_NUMBER) + 1;
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
