package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int value = random.nextInt(MAX_NUMBER);
        Ball ball = new Ball(colorSupplier.getRandomColor(), value);
        return ball.toString();
    }
}
