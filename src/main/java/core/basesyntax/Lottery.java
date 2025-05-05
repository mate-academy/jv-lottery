package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_BALL_NUMBER);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}
