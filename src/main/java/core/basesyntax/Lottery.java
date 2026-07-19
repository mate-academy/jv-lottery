package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color color = supplier.getRandomColor();
        int number = random.nextInt(MAX_BALL_NUMBER + 1);
        return new Ball(color, number);
    }
}
