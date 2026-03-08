package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    private static final int MAX_BALL_BOUND = 101;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_BALL_BOUND);
        return new Ball(color, randomNumber);
    }
}
