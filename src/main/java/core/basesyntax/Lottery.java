package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Ball getRandomBall() {
        final int randomNumber = random.nextInt(LIMIT);
        final String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
