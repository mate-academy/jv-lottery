package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_RANDOM_NUMBER = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(BALL_MAX_RANDOM_NUMBER + 1);
        String color = colorSupplier.getRandomColor();

        return new Ball(color, number);
    }
}
