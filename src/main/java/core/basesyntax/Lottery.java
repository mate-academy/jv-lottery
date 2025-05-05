package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 100;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(NUMBER_OF_BALLS);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
