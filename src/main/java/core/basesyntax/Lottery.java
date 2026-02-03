package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomInt = random.nextInt(MAX_BALL_NUMBER) + 1;
        String color = colorSupplier.getRandomColor();
        return new Ball(color, randomInt);
    }
}
