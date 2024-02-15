package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_COUNT = 3;
    private static final int RANDOM_BOUND = 101;
    private static final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(RANDOM_BOUND);
        return new Ball(randomColor, randomNumber);
    }
}
