package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER_BOUND = 101;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = String.valueOf(colorSupplier.getRandomColor());
        int number = random.nextInt(MAX_BALL_NUMBER_BOUND);
        return new Ball(color, number);
    }
}
