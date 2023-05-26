package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = supplier.getRandomColor();
        int number = random.nextInt(MAX_BALL_NUMBER);
        return new Ball(color, number);
    }
}
