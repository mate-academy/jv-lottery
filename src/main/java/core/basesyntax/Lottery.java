package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_BALL_NUMBER) + 1;
        Color randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
