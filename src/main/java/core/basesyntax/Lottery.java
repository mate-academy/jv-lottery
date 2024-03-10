package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final ColorSupplier colors = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomTemp = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colors.getRandomColor();
        return new Ball(randomColor, randomTemp);
    }
}
