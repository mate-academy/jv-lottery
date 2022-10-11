package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_COUNT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_BALL_COUNT + 1);
        return new Ball(color, number);
    }
}
