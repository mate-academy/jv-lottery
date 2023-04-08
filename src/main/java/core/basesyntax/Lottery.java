package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int value = random.nextInt(MAX_BALL_NUMBER);
        return new Ball(randomColor, value);
    }
}
