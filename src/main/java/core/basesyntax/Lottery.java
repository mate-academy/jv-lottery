package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
        return new Ball(randomColor, randomNumber);
    }
}
