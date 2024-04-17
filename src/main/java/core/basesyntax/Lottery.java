package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_BALL_NUMBER);

        return new Ball(color, randomNumber);
    }
}
