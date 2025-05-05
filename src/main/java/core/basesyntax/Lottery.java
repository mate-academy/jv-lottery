package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM = 100;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_RANDOM);
        return new Ball(ballColor, randomNumber);
    }
}
